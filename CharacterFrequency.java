import java.util.HashMap;
import java.util.Scanner;
public class CharacterFrequency {
    public static HashMap<Character, Integer> charFrequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = str.toCharArray();

        for(char c : ch){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        return map;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = scan.nextLine();

        HashMap<Character, Integer> result = charFrequency(word);

        for(char key : result.keySet()){
            System.out.println(key +" -> " + result.get(key));
        }
        scan.close();
    }
}
