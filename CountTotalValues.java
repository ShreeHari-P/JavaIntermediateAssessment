import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTotalValues {
    public static void sumOfValues(HashMap<String, Integer> data){

        int sum = 0;
        for(Map.Entry<String, Integer> entry : data.entrySet()){
            sum += entry.getValue();
        }

        System.out.println("Sum of all values: "+sum);
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

        sumOfValues(data);
        scan.close();
    }
}
