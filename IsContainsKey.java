import java.util.HashMap;
public class IsContainsKey {
    public static void main(String[] args){
        HashMap<String, String> hash = new HashMap<>();

        hash.put("Pondicherry","Union Teritory");
        hash.put("India","Country");
        hash.put("TamilNadu","State");
        hash.put("Karur","District");

        System.out.println("1. Does map contains 'India'? "+hash.containsKey("India"));

        System.out.println("2.Does map contains 'USA'? "+hash.containsKey("USA"));

        System.out.println("3.Does map contains 'india'? "+hash.containsKey("india"));

        String[] keysToCheck = {"India","Karur","chennai","TamilNadu"};
        System.out.println("\n4.To check multiple keys: ");
        for(String key : keysToCheck){
            boolean exists = hash.containsKey(key);
            System.out.println(" "+key+" -> "+(exists ? "Found" : "Not Found"));
        }

        System.out.println("\n5.Hash Contents: ");
        System.out.println(" "+hash);
    }
}
