/**
 * Created by danawacomputer on 2017-04-04.
 */
public class AppleShop {

    public static void main(String[] args) {

        int regularPriceForiPadPro = 999_000;
        double dcRate = 15.0 / 100;

        int resultPrice =
                (int)(regularPriceForiPadPro * (1 - dcRate));

        System.out.println(resultPrice + "원");
    }
}
