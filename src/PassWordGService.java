/**
 * Created by danawacomputer on 2017-04-07.
 */
public class PassWordGService {

    public String makePassword(
            String source, String prefix, String postfix) {
        int squareLengthOfChar = source.length() * source.length();

        source =
                source.substring(0,1).toUpperCase()
                        + source.substring(1);

        String passwordGenerated =
                prefix + source
                        + squareLengthOfChar + postfix;

        return passwordGenerated;
    }

}
