import java.util.HashSet;
import java.util.Scanner;

public class FindPairSum {
    public static void findPair(int[] arr, int target){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            int complement = target - num;

            if(set.contains(complement)){
                System.out.println(complement + " + " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("No Pair found");
    }
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        findPair(arr, target);
    }
}
