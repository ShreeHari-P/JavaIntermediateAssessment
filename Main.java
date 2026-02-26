import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void addElement(HashSet<String> hash, String[] key){

        for(String element : key){
            hash.add(element);
        }

        System.out.println("HashSet: " + hash);
    }
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] keys = new String[n];

        hash.add("apple");
        hash.add("mango");

        for(int i = 0; i < n; i++){
            keys[i] = scan.next();
        }

        addElement(hash, keys);
        scan.close();
    }
}
