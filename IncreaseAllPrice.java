import java.util.HashMap;
import java.util.Scanner;

public class IncreaseAllPrice {
    public static HashMap<String, Double> increasePrices(HashMap<String, Double> products, double percent){

        for(String key : products.keySet()){
            double oldPrice = products.get(key);

            double newPrice = oldPrice + (oldPrice * percent / 100);

            products.put(key, newPrice);
        }

        return products;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> products = new HashMap<>();

        System.out.println("Enter no.of Products: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            double value = scan.nextDouble();
            products.put(key, value);
        }

        System.out.println("Enter the Percent: ");
        double percent = scan.nextDouble();
        
        HashMap<String, Double> result = increasePrices(products, percent);
        System.out.println(result);
        scan.close();
    }
}
