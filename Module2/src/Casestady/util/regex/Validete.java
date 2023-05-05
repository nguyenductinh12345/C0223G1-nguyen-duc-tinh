package Casestady.util.regex;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validete {
    public static final String EMPLOYEE_REGEX_MA = "^(NV-)\\d{4}$";

    public boolean employeeRegexMa(String ma) {
        return Pattern.matches(EMPLOYEE_REGEX_MA, ma);
    }

    public static final String REGEX_TEN = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";

    public boolean regexTen(String ten) {
        return Pattern.matches(REGEX_TEN, ten);
    }

    public static final String REGEX_TUOI = "^\\d{4}-\\d{2}-\\d{2}$";

    public boolean regextuoi(String tuoi) {
        if (tuoi.matches(REGEX_TUOI)) {
            LocalDate tuoiHienTai = LocalDate.parse(tuoi);
            LocalDate thoiGianHienTai = LocalDate.now();
            return Period.between(tuoiHienTai, thoiGianHienTai).getYears() >= 18;
        }
        return false;
    }
    public static final String REGEX_CMND = "^\\d{9}|\\d{12}$";
    public boolean regexCmnd(String cmnd){
        return Pattern.matches(REGEX_CMND,cmnd);
    }
    public static final String REGEX_SODIENTHOAI = "^0\\d{9}$";
    public boolean regexSoDienThoai(String soDienThoai){
        return Pattern.matches(REGEX_SODIENTHOAI,soDienThoai);
    }
    public static final String CUSTOMER_REGEX_MA = "^(KH-)\\d{4}$";
    public boolean customerMa(String ma){
        return Pattern.matches(CUSTOMER_REGEX_MA,ma);
    }
}
