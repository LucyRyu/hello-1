/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Celcius2Fahrenheit {

    public static void main(String[] args) {
        // 섭씨
        int celcius = 19;

        Celcius2FahrenheitService service =
                new Celcius2FahrenheitService();

        double result = service.toFaranheit(celcius);

        String str = new String("hello");
        //String str = "hello";


        System.out.println(result);
    }
}
