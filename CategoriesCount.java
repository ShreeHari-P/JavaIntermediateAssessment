import java.util.HashMap;

public class CategoriesCount {
      public static void main(String[] args){
        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();

        HashMap<String, Integer> watch = new HashMap<>();
        watch.put("Rolex",100);
        watch.put("Timex",60);
        watch.put("Casio",55);

        HashMap<String, Integer> shoe = new HashMap<>();
        shoe.put("Adidas",99);
        shoe.put("Nike",39);

        inventory.put("Watch",watch);
        inventory.put("Shoe",shoe);

        int value = inventory.size();
        System.out.println("Total no.of Categories: "+value);
    }
}
