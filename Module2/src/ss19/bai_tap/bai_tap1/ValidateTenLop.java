package ss19.bai_tap.bai_tap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTenLop {
    private static final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";
    public ValidateTenLop(){
    }
    public boolean valideta(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
