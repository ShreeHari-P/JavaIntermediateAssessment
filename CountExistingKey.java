import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class CountExistingKey {
    public static int keyChecker(HashMap<String, Integer> randomValues, String[] keys){

        int count = 0;

        for(String key : keys){
            if(randomValues.containsKey(key)){
                count++;
            }
        }
        return count;
    }   
    
    public static void main(String[] args){
        
    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("Alice", 95);
    scores.put("Bob", 87);
    scores.put("Charlie", 92);
    
    String[] names = {"Alice", "David", "Bob", "Eve"};
    
    int existingCount = keyChecker(scores, names);
    System.out.println("Number of existing keys: " + existingCount); // Output: 2
      
    }
}
