import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void frequencyCount(String word){

        HashMap<Character, Integer> data = new HashMap<>();
        for(char ch : word.toCharArray()){
            data.put(ch, data.getOrDefault(ch, 0)+1);
        }

        for(char key : data.keySet()){
            System.out.println(key + " = " + data.get(key));
        }
   }    

   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        frequencyCount(word);
        scan.close();
   }
}
