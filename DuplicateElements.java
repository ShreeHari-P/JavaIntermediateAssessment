import java.util.HashMap;
import java.util.Scanner;
public class DuplicateElements {
    public static void repeatingElements(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int n : map.keySet()){
            if(map.get(n) > 1){
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 2, 1, 8, 10, 2,5};
        repeatingElements(arr);
    }
}
