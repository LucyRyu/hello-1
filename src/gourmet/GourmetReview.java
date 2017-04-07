package gourmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {

    public static void main(String[] args) {

        //맛집 객체를 5개 만든다.
        Gourmet spoon = new Gourmet();
        System.out.println("이라인은 생성자 호출 바로 후에 실행될거에요");
        spoon.setTitle("숟가락반상 마실");
        spoon.setMainMenu("한정식, 떡갈비, 갈비찜");
        spoon.setScore(111);

        Gourmet sushi = new Gourmet();
        sushi.setTitle("스시메이진");
        sushi.setMainMenu("스시, 스시뷔페");
        sushi.setScore(70);

        Gourmet chan = new Gourmet();
        chan.setTitle("맛찬들");
        chan.setMainMenu("한정식, 떡갈비, 갈비찜");
        chan.setScore(49);

        Gourmet choi = new Gourmet();
        choi.setTitle("최우영스시");
        choi.setMainMenu("한정식, 떡갈비, 갈비찜");
        choi.setScore(49);

        Gourmet ranch = new Gourmet();
        ranch.setTitle("철판목장");
        ranch.setMainMenu("한정식, 떡갈비, 갈비찜");
        ranch.setScore(46);

        Gourmet yongho =
                new Gourmet("용호낙지", "낙새, 낙곱새", 46);


        // 맛집객체를 리스트에 담는다.
        List<Gourmet> list = Arrays.asList(
                spoon, sushi, chan, choi, ranch
        );

        // 맛집 점수 평균 구하기
        GourmetService service = new GourmetService();
        double average = service.calcAverageScore(list);

        System.out.printf("맛집 점수 평균은 %.1f입니다.", average);
    }
}
