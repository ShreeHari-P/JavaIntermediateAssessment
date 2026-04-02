public class ValidatePassword {
    public static String validatePassword(String password){

        if(password == null || password.isEmpty()){
            return "Invalid input";
        }

        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasLength = password.length() >= 8;

        if(hasUpper && hasLower && hasDigit && hasLength){
            return "Strong";
        } else {
            return "Weak";
        }
    }

    public static void main(String[] args){
        String result = validatePassword("Users123");
        System.out.println(result);
    }
}
