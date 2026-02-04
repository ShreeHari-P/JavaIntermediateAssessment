import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LowStockItem {
    public static void stockItem(HashMap<String, Integer> stock){

        for(Map.Entry<String, Integer> entry : stock.entrySet()){

            if(entry.getValue() < 5){
                System.out.println("Low stock -> Product: "+entry.getKey()
                                    +", Quantity: "+entry.getValue());
            }
        }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> stock = new HashMap<>();

        System.out.println("Enter no.of stock: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String item = scan.next();
            int qty = scan.nextInt();
            stock.put(item, qty);
        }

        stockItem(stock);
        scan.close();
    }
}
