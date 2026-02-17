import java.util.HashMap;
import java.util.Scanner;

public class CheapestProduct {
    public static String findCheapest(HashMap<String, Double> products) {
    // Check if the map is empty
    if (products == null || products.isEmpty()) {
        return "";
    }
    
    String cheapestProduct = "";
    double lowestPrice = Double.MAX_VALUE;
    
    // Iterate through the map to find the product with lowest price
    for (HashMap.Entry<String, Double> entry : products.entrySet()) {
        if (entry.getValue() < lowestPrice) {
            lowestPrice = entry.getValue();
            cheapestProduct = entry.getKey();
        }
    }
    
    return cheapestProduct;
}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> product = new HashMap<>();

        System.out.println("Enter no.of Elements: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            double value = scan.nextDouble();
            product.put(key, value);
        }

        String result = findCheapest(product);
        System.out.println("Total no.of Expensive Product: " + result);
        scan.close();
    }    
}
