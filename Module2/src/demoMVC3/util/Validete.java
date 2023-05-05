package demoMVC3.util;

import java.util.regex.Pattern;

public class Validete {
    public static final String STUDENT_REGEX_ID = "^(HS-)\\d{4}$";

    public boolean studentRegexId(String id) {
        return Pattern.matches(STUDENT_REGEX_ID, id);
    }

    public static final String STUDENT_REGEX_NAME = "^[AZ][az]*(\\s[AZ][az]*)*$";

    public boolean studentRegexName(String name) {
        return Pattern.matches(STUDENT_REGEX_NAME, name);
    }
}
