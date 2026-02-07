import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintInventory {
    public static void PrintInventoryEntrySet(HashMap<String, Integer> inventory){
    for(Map.Entry<String, Integer> entry : inventory.entrySet()){
    System.out.println("Product: "+entry.getKey()+", Quantity: "+entry.getValue());
    }
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

        PrintInventoryEntrySet  (inventory);
        scan.close();
    }
}
