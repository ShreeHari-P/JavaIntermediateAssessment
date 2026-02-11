import java.util.HashMap;
import java.util.Scanner;

public class SearchAndPrint {
    public static void categoryPrint(HashMap<String, HashMap<String, Integer>> category, String key){
        
        boolean isFound = false;

        for(String categories : category.keySet()){

            HashMap<String, Integer> product = category.get(categories);

            for(String products : product.keySet()){
                if(key.equals(products)){
                    System.out.println("Found in: "+ categories);
                    isFound = true;
                    break;
                }
            }
            if(isFound) break;
        }

        if(!isFound) System.out.println("Product Not Found!");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();

        HashMap<String, Integer> electronics = new HashMap<>();
        electronics.put("Laptop", 1200);
        electronics.put("Phone", 800);

        HashMap<String, Integer> furniture = new HashMap<>();
        furniture.put("Chair",50);
        furniture.put("Table",150);

        inventory.put("Electronics", electronics);
        inventory.put("Furniture", furniture);

        System.out.print("Enter product name: ");
        String search = scan.nextLine();

        categoryPrint(inventory, search);
        scan.close();
    }
}
