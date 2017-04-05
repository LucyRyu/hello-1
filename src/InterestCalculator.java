import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class InterestCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("원금을 입력하세요: ");
        int principal = in.nextInt();

        System.out.print("이율을 입력하세요: ");
        double rate = in.nextDouble();

        System.out.print("기간을 입력하세요: ");
        int howManyMonth = in.nextInt();

        // Process
        // 이자계산공식 : 이자 = 원금 x 이율(연이율/100) x (월/12)
        double interest =
                principal * (rate/100) * (howManyMonth/12);

        double total = interest + principal;

        // Output
        System.out.printf(
                "%d 개월 후에 당신은 %f원을 받을수 있습니다.",
                howManyMonth, total);

    }
}
