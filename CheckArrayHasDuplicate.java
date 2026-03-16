import java.util.HashSet;
import java.util.Scanner;

public class CheckArrayHasDuplicate {
    public static boolean checkDuplicates(HashSet<Integer> set,int[] arr){

        for(int num : arr){

            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }

        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        boolean result = checkDuplicates(set, arr);
        System.out.println("Is there any duplicates: " + result);
    }
}
