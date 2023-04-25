package ss19.bai_tap.bai_tap2;

public class TextPhoneNumber {
    private static PhoneNumber phoneNumber;
    private static final String[] valiphonenumber = new String[]{"09-0238949580", "09-0723412345"};
    private static final String[] devaliphonenumber = new String[]{"09-924214212", "08-a35525252"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String s:valiphonenumber){
            boolean isvalid = phoneNumber.validate(s);
            System.out.println("PhoneNumber "+s+" "+isvalid);
        }
        for (String s:devaliphonenumber) {
            boolean isvalid = phoneNumber.validate(s);
            System.out.println("PhoneNumber "+s+" "+isvalid);
        }
    }
}
