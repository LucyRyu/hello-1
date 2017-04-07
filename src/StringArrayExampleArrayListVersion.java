import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayExampleArrayListVersion {

    public static void main(String[] args) {

        String[] strArr = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시",
                "철판목장", "용호낙지", "은행골", "메이비", "돌배기집", "구로곱창",
        };

//        List<String> goumet = new ArrayList<>();
//        goumet.add("숟가락반상 마실");
//        goumet.add("스시메이진");
//        ...

        List<String> goumet = Arrays.asList(
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시",
                "철판목장", "용호낙지", "은행골", "메이비", "돌배기집", "구로곱창"
        );

        List<String> goumetUnderThreeChar = new ArrayList<>();

        for (String e : goumet) {
            if (e.length() <= 3) {
                goumetUnderThreeChar.add(e);
            }
        }

        //새로 만들어진 리스트 출력
        for (String e : goumetUnderThreeChar) {
            System.out.println(e);
        }
    }
}
