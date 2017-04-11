package majorleague;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\Parks.csv");
        BufferedReader br = new BufferedReader(fr);

//        while (true) {
//            String line = br.readLine();
//            if (line == null) {
//                break;
//            }
//        }

        List<Park> parkList = new ArrayList<>(); // list for park objects
        br.readLine(); // skip the first line
        String line = "";
        while ((line = br.readLine()) != null) {

            String[] splitted = line.split(",");
            parkList.add(new Park(splitted[0], splitted[1],
                    splitted[2], splitted[3], splitted[4], splitted[5]));
        }

        ParkService service = new ParkService();

        int notUs = service.getParkNotInUS(parkList);
        List<Park> haveAlias = service.getParkIncludeAlias(parkList);
        double mean = service.getMeanValueWithParkName(parkList);

        System.out.printf("%d, %s, %.1f", notUs, haveAlias, mean);
        System.out.println(notUs + ", " + haveAlias + ", " + mean);



        String salary = "125000";

        int intSalary = Integer.parseInt(salary);

    }
}
