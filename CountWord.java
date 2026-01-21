import java.util.HashMap;
public class CountWord {
    public static HashMap<String, Integer> countWordFrequency(String sentence){
        
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = sentence.split(" ");

        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        return map;
    }

    public static void main(String[] args){
        String input = "apple banana apple orange banana apple";

        HashMap<String, Integer> result = countWordFrequency(input);

        for(String key : result.keySet()){
            System.out.println(key + " -> " + result.get(key));
        }
    }
}
