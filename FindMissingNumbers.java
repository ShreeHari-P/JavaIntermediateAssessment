import java.util.HashSet;
import java.util.Scanner;

public class FindMissingNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> hash = new HashSet<>();
        
        int size = scan.nextInt();
        for(int i = 0; i < size; i++){
            int num = scan.nextInt();
            hash.add(num);
        }

        int n = scan.nextInt();
        System.out.print("Missing: ");
        for(int i = 1; i <= n; i++){
            if(!hash.contains(i)){
                System.out.print(i + " ");
            }
        }
    }    
}
