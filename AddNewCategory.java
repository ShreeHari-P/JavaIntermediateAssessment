import java.util.HashMap;

public class AddNewCategory {

    public static void addProduct(HashMap<String, HashMap<String, Integer>> category,
                                  String[] operations) {

        for (String op : operations) {

            // Split operation
            String[] parts = op.split(" ");

            String command = parts[0];   // ADD
            String categ = parts[1];     // Electronics
            String prod = parts[2];      // Camera
            int value = Integer.parseInt(parts[3]); // 500

            // Process only ADD
            if (command.equals("ADD")) {

                // If category exists
                if (category.containsKey(categ)) {

                    HashMap<String, Integer> products = category.get(categ);
                    products.put(prod, value);

                }
                // If category does not exist
                else {

                    HashMap<String, Integer> newCategory = new HashMap<>();
                    newCategory.put(prod, value);

                    category.put(categ, newCategory);
                }
            }
        }
    }

    // Print inventory
    public static void printInventory(HashMap<String, HashMap<String, Integer>> category) {

        for (String cat : category.keySet()) {

            System.out.println("Category: " + cat);

            HashMap<String, Integer> products = category.get(cat);

            for (String prod : products.keySet()) {

                System.out.println("  " + prod + " : " + products.get(prod));
            }
        }
    }

    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();

        // Initial data
        HashMap<String, Integer> electronics = new HashMap<>();
        electronics.put("Laptop", 1200);

        inventory.put("Electronics", electronics);

        // Operations
        String[] operations = {
                "ADD Electronics Camera 500",
                "ADD Books Java 300"
        };

        // Add products
        addProduct(inventory, operations);

        // Print result
        printInventory(inventory);
    }
}
