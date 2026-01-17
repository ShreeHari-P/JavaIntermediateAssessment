import java.util.HashMap;
public class ValueByKey {
    public static void main(String[] args){
        HashMap<String, Integer> hash = new HashMap<>();

        hash.put("apple", 50);
        hash.put("banana",20);
        hash.put("grape",40);
        hash.put("orange", 70);

        System.out.println("Price of an Apple: "+hash.get("apple"));

        Integer orangePrice = hash.get("orange");
        System.out.println("Price of an Orange: "+orangePrice);
    }
}
