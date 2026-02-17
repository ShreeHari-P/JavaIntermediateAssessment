import java.util.HashMap;
import java.util.Scanner;

public class CountExpensiveProduct {
    public static int countExpensive(HashMap<String, Double> product){

        int count = 0;

        for(String key : product.keySet()){
            double price = product.get(key);
            if(price > 100.0){
                count++;
            }
        }
        
        return count;
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

        int result = countExpensive(product);
        System.out.println("Total no.of Expensive Product: " + result);
    }
}
