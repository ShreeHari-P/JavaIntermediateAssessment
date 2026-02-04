import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class ProductPriceList {
    public static void priceList(HashMap<String, Integer> products){

        for(Map.Entry<String, Integer> entry : products.entrySet()){
            System.out.println("Product: " + entry.getKey() +
                                ", Price: "+entry.getValue());
        }
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> products = new HashMap<>();

        System.out.print("Enter no. of Products: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            products.put(key, value);
        }

        priceList(products);
        scan.close();
    }
}
