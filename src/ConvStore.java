import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ConvStore {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("1:디스, 2:말보로");
        int whichTabacco = in.nextInt();

        System.out.print("나이?");
        int age = in.nextInt();

        System.out.print("수량?");
        int quantity = in.nextInt();

        int prodPrice = 0;
        if (whichTabacco == 1) {
            prodPrice = 4500;
        } else if (whichTabacco == 2) {
            prodPrice = 5200;
        } else {}

        double resultPrice = prodPrice * quantity;

        if (age < 19) {
            resultPrice = resultPrice * 0.8;
            System.out.println("19세 미만 20프로 디스카운트 들어갔어요");
        } else if (age >= 45) {
            resultPrice = resultPrice * 1.3;
            System.out.println("45세이상 30프로 더 냈어요");
        }

        System.out.printf("가격은 %f원입니다.", resultPrice);
    }
}
