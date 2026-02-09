import java.util.HashMap;

public class FindHighestPrice{
    public static void findHighestPrice(HashMap<String, HashMap<String, Integer>> inventory){

        for(String category : inventory.keySet()){

        HashMap<String, Integer> products = inventory.get(category);

        if(products.isEmpty()){
            System.out.println(category + " -> No products");
            continue;
        }
        int maxPrice = Integer.MIN_VALUE;
        String maxProduct = null;

        for(String product : products.keySet()){
            
            int price = products.get(product);

            if(price > maxPrice){
                maxPrice = price;
                maxProduct = product;
            }
        }
        System.out.println(category + " -> " + maxProduct + " (" + maxPrice + ")");
        }
    }

    public static void main(String[] args){

        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();

        // Electronics category
        HashMap<String, Integer> electronics = new HashMap<>();
        electronics.put("Laptop", 1200);
        electronics.put("Phone", 800);
        electronics.put("Tablet", 600);

        // Furniture category
        HashMap<String, Integer> furniture = new HashMap<>();
        furniture.put("Chair", 50);
        furniture.put("Table", 150);
        furniture.put("Sofa", 100);

        inventory.put("Electronics", electronics);
        inventory.put("Furniture", furniture);

        // Find highest priced product
        findHighestPrice(inventory);
    }
}