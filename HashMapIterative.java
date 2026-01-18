import java.util.HashMap;
import java.util.Map;
public class HashMapIterative {
    public static void main(String[] args){
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Arthi", 99);
        studentMarks.put("Shruthi",90);
        studentMarks.put("kalai",72);
        studentMarks.put("Sesu", 88);

        System.out.println("===Using entrySet()===");
        for(Map.Entry<String, Integer> entry : studentMarks.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +" : "+ value);
        }
    }
}
