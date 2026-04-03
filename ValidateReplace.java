public class ValidateReplace {
    public static String processText(String text){

        if(text == null || text.isBlank()){
            return "Invalid input";
        }

        String result = text.replaceAll("[0-9]","*");

        if(result.matches("[a-zA-Z]+")){
            return "Clean";
        }else{
            return "Not Clean";
        }
    }

    public static void main(String[] args){
        String output = processText("abc123");
        String output1 = processText("abc");
        
        System.out.println(output +"\n" + output1);
    }
}
