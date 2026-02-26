import java.util.HashSet;
import java.util.Scanner;

public class CheckIfExists {
    public static void checkElement(HashSet<String> hash, String element){

        if(hash.contains(element)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        hash.add("Apple");
        hash.add("Redmi");
        hash.add("Realme");
        hash.add("Vivo");

        String element = scan.next();
        checkElement(hash, element);
        scan.close();
    }
}
