public class UsernameValidation {
    public static String validateUsername(String username){

        if(username == null || username.isEmpty()){
            return "Invalid input";
        }

        if(username.matches("[a-zA-Z0-9]{5,12}+")){
            return "Valid";
        }

        return "Invalid";
    }
    public static void main(String[] args){
        String result = validateUsername("user123");
        System.out.println(result);
    }
}
