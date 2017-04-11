package majorleague;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class ParkService {

    public int getParkNotInUS(List<Park> parkList) {

        int usCount = 0;
        for (Park e : parkList) {
            if (!e.getCountry().equals("US")) {
                usCount++;
            }
        }
        return usCount;
    }

    public List<Park> getParkIncludeAlias(List<Park> parkList) {

        List<Park> newList = new ArrayList<>();
        for (Park e : parkList) {
            if (!e.getParkAlias().equals("")) {
                newList.add(e);
            }
        }
        return newList;
    }

    public double getMeanValueWithParkName(List<Park> parkList) {

        int totalParkNameLength = 0;
        for (Park e : parkList) {
            totalParkNameLength += e.getParkName().length();
        }
        return (double)totalParkNameLength / parkList.size();
    }
}
