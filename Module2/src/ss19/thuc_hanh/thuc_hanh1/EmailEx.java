package ss19.thuc_hanh.thuc_hanh1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEx {
    public static class EmailExample {
        private static Pattern pattern;
        private Matcher matcher;

        private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        public EmailExample() {
            pattern = Pattern.compile(EMAIL_REGEX);
        }

        public boolean validate(String regex) {
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }

        private static EmailExample emailExample;
        public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

        public static void main(String args[]) {
            emailExample = new EmailExample();
            for (String email : validEmail) {
                boolean isvalid = emailExample.validate(email);
                System.out.println("Email is " + email + " is valid: " + isvalid);
            }
            for (String email : invalidEmail) {
                boolean isvalid = emailExample.validate(email);
                System.out.println("Email is " + email + " is valid: " + isvalid);
            }
        }
    }
}

