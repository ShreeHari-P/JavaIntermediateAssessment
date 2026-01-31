import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
public class MaximumKey {
    public static void maxValueKey(HashMap<String, Integer> data){

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : data.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }   
        }

        System.out.println("Max Key: " + maxKey);
        System.out.println("Maximum value: "+maxValue);
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

        maxValueKey(data);
        scan.close();
    }
}
