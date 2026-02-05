import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpenseProduct {
    public static void expenseProduct(HashMap<String, Integer> product){

        String max_product = null;
        int max_price = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : product.entrySet()){

            if(entry.getValue() > max_price){
                max_price = entry.getValue();
                max_product = entry.getKey();
            }
        }
        
        if(max_product != null)
            System.out.println("Most Expensive Product: "
                                +max_product +
                                " ("
                                +max_price+
                                ")");
        else
            System.out.println("No product found");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> product = new HashMap<>();

        System.out.print("Enter no.of products: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String prod = scan.next();
            int price = scan.nextInt();
            product.put(prod, price);
        }

        expenseProduct(product);
        scan.close();
    }
    
}
