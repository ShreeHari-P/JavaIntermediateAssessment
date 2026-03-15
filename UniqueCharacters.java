import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacters {
    public static void uniqueChar(String str){

        HashSet<Character> hash = new HashSet<>();

        for(Character ch : str.toCharArray()){
            hash.add(ch);
        }

        System.out.println("Unique Character: " + hash);
        System.out.println("Size: " + hash.size());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        uniqueChar(str);
        scan.close();
    }
}
