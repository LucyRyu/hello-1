/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {

    public static void main(String[] args) {

        String[] strArr = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시",
                "철판목장", "용호낙지", "은행골", "메이비", "돌배기집", "구로곱창",
        };
        //1. 각 엘레먼트의 글자 수의 평균 구하기
        int charCount = 0;

        for (String e : strArr) {
            charCount += e.length();
        }
        System.out.println((double)charCount / strArr.length);

        //2. 글자수가 3글자 이하인 엘레먼트의 배열을 만드세요.
        String[] resultArr = new String[strArr.length];
        int count = 0;
        for (String e : strArr) {

            if (e.length() <= 3) {
                resultArr[count] = e;
                count++;
            }
        }

        for (String e : resultArr) {
            System.out.println(e);
        }
    }
}
