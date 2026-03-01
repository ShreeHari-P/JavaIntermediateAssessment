import java.util.HashSet;
import java.util.Scanner;

public class FindDifference {
    public static void findDifference(HashSet<String> set1, HashSet<String> set2){

        HashSet<String> result = new HashSet<>(set1);
        result.removeAll(set2);

        System.out.println("Intersection: " + result);
    }
    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        System.out.print("Enter size of set 1: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String element = scan.next();
            set1.add(element);
        }

        HashSet<String> set2 = new HashSet<>();
        System.out.print("Enter size of set 2: ");
        int m = scan.nextInt();

        for(int i = 0; i < m; i++){
            String element = scan.next();
            set2.add(element);
        }

        findDifference(set1, set2);
        scan.close();
    }
}
