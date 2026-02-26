import java.util.HashSet;
import java.util.Scanner;

public class PrintSize {
    public static void printSize(HashSet<String> hash){

        int size = hash.size();
        System.out.println("Size of the HashSet: " + size);
    }
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        hash.add("Dell");
        hash.add("Lenovo");
        hash.add("Vivo");

        System.out.print("To Add Elements enter no. or zero: ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String element = scan.next();
            hash.add(element);
        }
        printSize(hash);
        scan.close();
    }
}
