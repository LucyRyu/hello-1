package hall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFameMain {

    public static void main(String[] args) {

        HallOfFame hall =
                new HallOfFame(
                        "kim", 200, 250, 300);

        List<HallOfFame> halls = new ArrayList<>();
        halls.add(hall);

        List<PlayerAverage> newList = new ArrayList<>();

        PlayerAverage pa = new PlayerAverage();
        for (HallOfFame e : halls) {

            pa = new PlayerAverage();
            pa.setPlayerId(e.getPlayerId());
            pa.setAverage(
                    (e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
            newList.add(pa);
        }
    }
}
