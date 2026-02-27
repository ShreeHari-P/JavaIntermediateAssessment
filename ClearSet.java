import java.util.HashSet;
import java.util.Scanner;

public class ClearSet {
    public static void clearSet(HashSet<String> hash){

        hash.clear();
        System.out.println("After Cleared HashSet: " + hash);
    }
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no.of Elements: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String element = scan.next();
            hash.add(element);
        }
        clearSet(hash);
        scan.close();
    }
}
