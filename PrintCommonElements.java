import java.util.HashSet;
import java.util.Scanner;

public class PrintCommonElements {
    public static void printCommon(HashSet<String> set1, HashSet<String> set2){
        
        HashSet<String> result = new HashSet<>(set1);
        result.retainAll(set2);

        System.out.println("Common Elements: " + result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        System.out.print("Enter size of Set 1: ");
        int n1 = scan.nextInt();

        for (int i = 0; i < n1; i++) {
            set1.add(scan.next());
        }

        System.out.print("Enter size of Set 2: ");
        int n2 = scan.nextInt();

        for (int i = 0; i < n2; i++) {
            set2.add(scan.next());
        }

        printCommon(set1, set2);
        scan.close();
    }
}
