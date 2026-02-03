import java.util.Scanner;
import java.util.HashMap;

public class CountWordFrequency {
    public static void wordFrequency(String word){

        HashMap<String, Integer> data = new HashMap<>();
        for(String key : word.split(" ")){
            
            data.put(key, data.getOrDefault(key, 0)+1);
        } 

        System.out.println("Word Frequency: ");
        for(String key : data.keySet()){
            System.out.println(key + " -> "+ data.get(key));
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        wordFrequency(word);
        scan.close();
    }
}
