import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class IncreaseValue {
    public static void increaseValues(HashMap<String, Integer> data){

        for(Map.Entry<String, Integer> entry : data.entrySet()){
            entry.setValue(entry.getValue() + 10);
        }

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
        increaseValues(data);
        scan.close();
    }
}
