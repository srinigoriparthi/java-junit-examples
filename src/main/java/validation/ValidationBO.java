package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ValidationBO
 */
public class ValidationBO {
    public Boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }
}
