import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RemoveIfBelowThreshold {
    public static void removeLowValues(HashMap<String, Integer> data, int threshold){

        Iterator<Map.Entry<String, Integer>> iterator = data.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();

            if(entry.getValue() < threshold){
                iterator.remove();
            }
        }
        System.out.println(data);
        System.out.println("Remaining size: "+data.size());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            data.put(key, value);
        }

        scan.nextLine();
        int thresholdValue = scan.nextInt();
        removeLowValues(data, thresholdValue);
        scan.close();
    }
}
