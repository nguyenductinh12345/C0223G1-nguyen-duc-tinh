package DemoTraiCay.util;

import java.util.regex.Pattern;

public class Validete {
    public static final String REGEX_ID ="^(TC-)\\d{4}$";
    public boolean regexId(String id){
       return Pattern.matches(REGEX_ID,id);
    }
    public static final String REGEX_TEN ="^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    public boolean regexTen(String ten){
        return Pattern.matches(REGEX_TEN,ten);
    }
    public static final String REGEX_NGAY = "^\\d{1,2}-\\d{1,2}-\\d{4}$";
    public boolean regexNgay(String ngay){
        return Pattern.matches(REGEX_NGAY,ngay);
    }

}
