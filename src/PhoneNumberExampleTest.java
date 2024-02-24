    public class PhoneNumberExampleTest {

        private static PhoneNumberExample phoneNumberExample;
        public static String validPhoneNumber = "(84)-(0978489648)";
        public static String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};

        public static void main(String[] args) {
            phoneNumberExample = new PhoneNumberExample();
                boolean isValid = phoneNumberExample.validate(validPhoneNumber);
                System.out.println("Phone number: " + validPhoneNumber + " is valid " + isValid);

            for (String phone : invalidPhoneNumber ) {
                boolean isValid2 = phoneNumberExample.validate(phone);
                System.out.println("Phone number: " + phone + " is valid " + isValid2);
            }
        }

    }

