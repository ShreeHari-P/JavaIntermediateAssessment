import java.util.HashMap;
import java.util.Scanner;
public class ResetSpecificKey {
    public static void resetKey(HashMap<String, Integer> data, String key){
        
        if(data.containsKey(key)) data.replace(key, 0);

        if(!data.containsKey(key)) System.out.println("Key not found");

        System.out.println(data);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<>();

        int m = scan.nextInt();
        for(int i = 0; i < m; i++){
            String key = scan.next();
            int value = scan.nextInt();
            data.put(key, value);
        }

        scan.nextLine();
        String key = scan.next();
        resetKey(data, key);
        scan.close();
    }
}
