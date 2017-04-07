package gourmet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetService {

    public double calcAverageScore(List<Gourmet> gourmetList) {

        int sum = 0;
        for (Gourmet e : gourmetList) {
            sum += e.getScore();
        }
        return (double)sum / gourmetList.size();
    }
}
