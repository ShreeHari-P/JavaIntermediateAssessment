import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintKeysAndValues {
    public static void printKeysAndValues(HashMap<String, Integer> data){

        System.out.println("Keys: ");
        for(String key : data.keySet()){
            System.out.println(key);
        }

        System.out.println("Values: ");
        for(int value : data.values()){
            System.out.println(value);
        }
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
        printKeysAndValues(data);
        scan.close();
    }
}
