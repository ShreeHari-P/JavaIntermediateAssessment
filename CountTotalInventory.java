import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTotalInventory {
    public static int calculateTotalItems(HashMap<String, Integer> inventory){

        int sum = 0;
        for(Map.Entry<String, Integer> entry : inventory.entrySet()){
            sum += entry.getValue();
        }

        return sum;        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();

        System.out.print("Enter no.of Inventory: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            inventory.put(key, value);
        }

        int totalSum = calculateTotalItems(inventory);
        System.out.println("Total Items: "+totalSum);
        scan.close();
    }    
}
