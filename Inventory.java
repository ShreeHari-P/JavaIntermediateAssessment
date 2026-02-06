import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Inventory {
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {

    if (inventory.isEmpty()) {
        System.out.println("No products in inventory.");
        return;
    }

    String product = null;
    int maxQuantity = 0;

    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {

        if (entry.getValue() > maxQuantity) {

            maxQuantity = entry.getValue();
            product = entry.getKey();
        }
    }

    System.out.println("Most Stocked Product: " + product
            + ", Quantity: " + maxQuantity);
}
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();

        System.out.println("Enter no.of stock: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String prod = scan.next();
            int qty = scan.nextInt();
            inventory.put(prod, qty);
        }

        printMostStockedProduct(inventory);
        scan.close();
    }
}
