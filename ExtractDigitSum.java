public class ExtractDigitSum {
    public static int digitSum(String text){
        
        if(text == null || text.isBlank()){
            return -1;
        }
        int sum = 0;

        for(char ch : text.toCharArray()){

            if(String.valueOf(ch).matches("[0-9]")){
                sum += ch - '0';
            }
        }

        return sum;
    }   

    public static void main(String[] args){
        int result = digitSum("a1b2c3");
        System.out.println(result);
    }
}
