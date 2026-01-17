import java.util.HashMap;
public class BasicHashMap {
    public static HashMap<Integer, String> createNumbers(){
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        return hashMap;    
    }

    public static void main(String[] args) {
        HashMap<Integer, String> myMap = createNumbers();

        System.out.println(myMap);

        System.out.println("Key 1 maps to: "+myMap.get(1));
    }
}
