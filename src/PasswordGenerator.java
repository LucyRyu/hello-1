import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator {

    public static void main(String[] args) {

        // input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.print("단어를 하나 입력하세요: ");
        String targetStr = in.nextLine();

        // second. processing
        String postfix = "##";

        if (targetStr.length() >= 8) {
            //8자리 이상일때 postfix를 안붙인다.
            postfix = "";
        }

        String prefix = "$$";

        int squareLengthOfChar =
                targetStr.length() * targetStr.length();

        targetStr =
                targetStr.substring(0,1).toUpperCase()
                        + targetStr.substring(1);

        String passwordGenerated =
                prefix + targetStr
                        + squareLengthOfChar + postfix;

        // the last.. output the result
        System.out.println(passwordGenerated);

    }
}
