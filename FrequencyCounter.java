import java.util.HashMap;
import java.util.Scanner;
public class FrequencyCounter {
    public static HashMap<Character, Integer> count(String word){

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character key : word.toCharArray()){
            map.put(key, map.getOrDefault(key,0)+1);
        }

        return map;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        HashMap<Character, Integer> result = count(str);

        for(Character key : result.keySet()){
            System.out.println(key + " -> " + result.get(key));
        }
        scan.close();
    }
}
