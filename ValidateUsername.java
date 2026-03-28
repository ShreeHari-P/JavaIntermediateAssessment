public class ValidateUsername{
    public static String validateUsername(String username){

        if(username == null) 
            throw new IllegalArgumentException("Username cannot be null");
        if(username.trim().isEmpty())
            throw new IllegalArgumentException("Username cannot be empty");
        if(username.length() < 4)
            throw new IllegalArgumentException("Username too short");

        return "Valid Username";
        
    }
    public static void main(String[] args){
        
        try{
            String result = validateUsername(null);
            System.out.println(result);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}