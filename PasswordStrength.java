public class PasswordStrength {
    public static String validatePassword(String password){

        if(password == null || password.length() == 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        if(password.length() < 6){
            throw new IllegalArgumentException("Weak Password");
        }
        
        boolean hasDigit = false;

        for(char ch : password.toCharArray()){
            if(Character.isDigit(ch)){
                hasDigit = true;
                break;
            }
        }

        if(!hasDigit){
            throw new IllegalArgumentException("Password must contain a number");
        }

        return "Strong Password";
    }

    public static void main(String[] args){
        
        try{
            String result = validatePassword("Hello");
            System.out.println(result);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
