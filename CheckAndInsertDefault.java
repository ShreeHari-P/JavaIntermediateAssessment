import java.util.HashMap;
import java.util.Scanner;
public class CheckAndInsertDefault {
    public static void checkAndInsertDefault(HashMap<String, Integer> map){

        System.out.println("Is Empty: "+map.isEmpty());
        map.putIfAbsent("Default",1);
        System.out.println("Size: "+map.size());

        System.out.println(map);
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            map.put(key, value);
        }

        checkAndInsertDefault(map);
        scan.close();
    }
}
