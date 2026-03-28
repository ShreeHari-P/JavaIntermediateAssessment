import java.util.Scanner;

public class ReverseString {
    public static String reverse(String word){

        if(word == null){
            return "Invalid input";
        }
        
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        return sb.toString();
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String reversed = reverse(word);
        System.out.println(reversed);
        scan.close();
    }
}
