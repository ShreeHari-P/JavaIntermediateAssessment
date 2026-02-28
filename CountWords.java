import java.util.HashSet;
import java.util.Scanner;

public class CountWords{
    public static void countWords(HashSet<String> hash){
        
        int count = 0;

        for(String s: hash){

            if(s.toLowerCase().startsWith("a")){
                count++;
            }
        }
        System.out.println("Count Words starts with 'A': "+count);
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
        countWords(hash);
        scan.close();
    }
}