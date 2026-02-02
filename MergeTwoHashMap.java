import java.util.HashMap;
import java.util.Scanner;

public class MergeTwoHashMap{
    public static void mergeMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2){

        map2.forEach((key, value) -> map1.merge(key, value, Integer :: sum));

        System.out.println("Merged Map size: " + map1.size());
        System.out.println(map1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        System.out.print("Enter no's for Map 1: ");
        int m = scan.nextInt();
        for(int i = 0; i < m; i++){
            String key = scan.next();
            int value = scan.nextInt();
            map1.put(key, value);
        }
        scan.nextLine();

        System.out.print("Enter no's for Map 2: ");
        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            map2.put(key, value);
        }

        mergeMaps(map1, map2);
        scan.close();
    }
}