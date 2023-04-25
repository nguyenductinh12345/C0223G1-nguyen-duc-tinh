package ss19.bai_tap.bai_tap1;

public class TextValidateTenLop {
    private static ValidateTenLop validateTenLop;
    private static final String[] valitenlop = new String[]{"C0223G","A0323K","C0224G","P0023K"};
    private static final String[] devalitenlop = new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        validateTenLop= new ValidateTenLop();
        for (String s:valitenlop) {
            boolean isvalid = validateTenLop.valideta(s);
            System.out.println("Tên lớp "+s+" "+isvalid);
        }
        for (String s:devalitenlop){
            boolean isvalid = validateTenLop.valideta(s);
            System.out.println("Tên lớp "+s+" "+isvalid);
        }
    }
}
