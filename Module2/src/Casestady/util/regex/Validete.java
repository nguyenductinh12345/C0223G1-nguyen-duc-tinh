package Casestady.util.regex;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validete {
    public static final String EMPLOYEE_REGEX_MA = "^(NV-)\\d{4}$";

    public boolean employeeRegexMa(String ma) {
        return Pattern.matches(EMPLOYEE_REGEX_MA, ma);
    }

    public static final String EMPLOYEE_REGEX_TEN = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";

    public boolean employeeRegexTen(String ten) {
        return Pattern.matches(EMPLOYEE_REGEX_TEN, ten);
    }

    public static final String EMPLOYEE_REGEX_TUOI = "^\\d{4}-\\d{2}-\\d{2}$";

    public boolean employeeTuoi(String tuoi) {
        if (tuoi.matches(EMPLOYEE_REGEX_TUOI)) {
            LocalDate tuoiHienTai = LocalDate.parse(tuoi);
            LocalDate thoiGianHienTai = LocalDate.now();
            return Period.between(tuoiHienTai, thoiGianHienTai).getYears() >= 18;
        }
        return false;
    }
    public static final String EMPLOYEE_REGEX_CMND = "^\\d{9}|\\d{12}$";
    public boolean employeeCmnd(String cmnd){
        return Pattern.matches(EMPLOYEE_REGEX_CMND,cmnd);
    }
    public static final String EMPLOYEE_REGEX_SODIENTHOAI = "^0\\d{9}$";
    public boolean employeeSoDienThoai(String soDienThoai){
        return Pattern.matches(EMPLOYEE_REGEX_SODIENTHOAI,soDienThoai);
    }
}
