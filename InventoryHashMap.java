import java.util.HashMap;

public class InventoryHashMap {

    // Method to find most expensive product in each category
    public static void printMostExpensiveProducts(
            HashMap<String, HashMap<String, Integer>> inventory) {

        // Check if inventory is empty
        if (inventory == null || inventory.isEmpty()) {
            System.out.println("No categories in inventory.");
            return;
        }

        // Loop through each category
        for (String category : inventory.keySet()) {

            System.out.println("Category: " + category);

            HashMap<String, Integer> products = inventory.get(category);

            // Check if products exist
            if (products == null || products.isEmpty()) {
                System.out.println("  No products available.");
                continue;
            }

            String maxProduct = null;
            int maxPrice = Integer.MIN_VALUE;

            // Find highest price
            for (String product : products.keySet()) {

                int price = products.get(product);

                if (price > maxPrice) {
                    maxPrice = price;
                    maxProduct = product;
                }
            }

            // Print result
            System.out.println("  Most Expensive Product: "
                    + maxProduct + ", Price: " + maxPrice);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Main inventory map
        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();

        // Electronics category
        HashMap<String, Integer> electronics = new HashMap<>();
        electronics.put("Mobile", 20000);
        electronics.put("Laptop", 55000);
        electronics.put("TV", 40000);

        // Clothing category
        HashMap<String, Integer> clothing = new HashMap<>();
        clothing.put("Shirt", 1500);
        clothing.put("Jeans", 2500);

        // Add categories to inventory
        inventory.put("Electronics", electronics);
        inventory.put("Clothing", clothing);

        // Call function
        printMostExpensiveProducts(inventory);
    }
}


