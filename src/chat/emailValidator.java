package chat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidator {

    public static boolean validEmail(String input) {
        String emailRegex =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);
        return matcher.find();
    }
}
