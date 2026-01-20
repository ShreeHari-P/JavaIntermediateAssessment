import java.util.HashMap;

public class RemoveEntry {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitPrices = new HashMap<>();
        
        // Add some entries
        fruitPrices.put("apple", 50);
        fruitPrices.put("banana", 30);
        fruitPrices.put("grape", 60);
        fruitPrices.put("orange", 40);
        
        System.out.println("Original HashMap: " + fruitPrices);
        
        // Remove key "grape" using remove(key)
        fruitPrices.remove("grape");
        
        System.out.println("After removing 'grape': " + fruitPrices);
    }
} 
