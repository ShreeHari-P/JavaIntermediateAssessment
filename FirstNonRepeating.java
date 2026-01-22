import java.util.HashMap;
import java.util.Scanner;
public class FirstNonRepeating {
    public static char firstNonRepeatingWord(String str){
        HashMap <Character, Integer> hash = new HashMap<>();

        for(char c : str.toCharArray()){
            hash.put(c, hash.getOrDefault(c,0)+1);
        }

        for(char c : str.toCharArray()){
            if(hash.get(c) == 1){
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        char result = firstNonRepeatingWord(s);

        if(result != '\0'){
            System.out.println("First Non Repeating Character: "+result);
        }else{
            System.out.println("No non-repeating character found");
        }
        scan.close();
    }
}
