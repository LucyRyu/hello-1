/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringManipulation {

    public static void main(String[] args) {

        String original = "soongon.kim";

        System.out.println(
                original.substring(0, original.indexOf(".")));

        String firstChar = original.substring(0,1); // s 잘나내기
        String charExceptFirst = original.substring(1); // oongon

        String result = charExceptFirst + firstChar ;

        System.out.println(result); // 1차 결과물
        System.out.println(result + "ay"); // 2차 결과물

    }
}
