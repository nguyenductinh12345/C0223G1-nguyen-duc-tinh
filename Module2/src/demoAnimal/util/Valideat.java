package demoAnimal.util;

import java.util.regex.Pattern;

public class Valideat {
    public static final String REGEX_ID = "^(AN-)\\d{4}$";
    public boolean regexId(String id){
        return Pattern.matches(REGEX_ID,id);
    }
    public static final String REGEX_TEN = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    public boolean regexTen(String ten){
        return Pattern.matches(REGEX_TEN,ten);
    }
}
