import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;

public class RemoveCheapProducts {
    public static void removeCheap(HashMap<String, Double> products){

        Iterator<Map.Entry<String, Double>> iterator = products.entrySet().iterator();

        while(iterator.hasNext()){

            Map.Entry<String, Double> entry = iterator.next();

            if(entry.getValue() < 20.0){
                iterator.remove();
            }
        }

        System.out.println(products);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> products = new HashMap<>();

        System.out.print("Enter no.of products: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            double value = scan.nextDouble();
            products.put(key, value);
        }

        removeCheap(products);
        scan.close();
    }
}
