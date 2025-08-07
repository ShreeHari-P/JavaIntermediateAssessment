import java.util.*;
public class passwordValidator {
    public static boolean isPasswordStrong(String password){
        if(password.length() < 8){
            return false;
        }

        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for(char c: password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true;
            } else if(Character.isLowerCase(c)){
                hasLowerCase = true;
            } else if(Character.isUpperCase(c)){
                hasUpperCase = true;
            }

            if(hasDigit && hasLowerCase && hasUpperCase){
                return true;
            }
        }
          return hasDigit && hasLowerCase && hasUpperCase;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        boolean result = isPasswordStrong(pass);
        System.out.println(result);
        scan.close();
    }
}
