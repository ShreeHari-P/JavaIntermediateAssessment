import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicates(String[] arr){

        HashSet<String> hash = new HashSet<>();
        for(String str : arr){
            hash.add(str);
        }

        System.out.println("After Removing Duplicates: " + hash);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");

        removeDuplicates(str);
        scan.close();
    }
}
