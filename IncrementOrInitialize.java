import java.util.HashMap;
import java.util.Scanner;

public class IncrementOrInitialize {
    public static void incrementOrInit(HashMap<String, Integer> data, String key){

        if(data.containsKey(key)) data.put(key, data.getOrDefault(key,0)+1);

        data.putIfAbsent(key, 1);

        System.out.println(data);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            data.put(key, value);
        }
        scan.nextLine();
        String keyString = scan.next();
        incrementOrInit(data, keyString);
        scan.close();
    }
}
