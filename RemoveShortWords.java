import java.util.HashSet;
import java.util.Scanner;

public class RemoveShortWords {
    public static void removeShortWords(HashSet<String> hash){

        for(String key : hash){
            
            if(key.length() < 4){
                hash.remove(key);
            }
        }
        System.out.println(hash);
    }
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String element = scan.next();
            hash.add(element);
        }

        removeShortWords(hash);
        scan.close();
    }
}
