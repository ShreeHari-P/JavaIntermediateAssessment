import java.util.HashMap;
import java.util.Scanner;
public class KeyAndValueCheck {
    public static void checkKeyAndValue(HashMap<String, Integer> data, String key, int value){

        System.out.println("Contains Key "+ key +" : "+data.containsKey(key));
        System.out.println("Contains value "+ value +": "+data.containsValue(value));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<>();

        data.put("Alice",90);
        data.put("BOb",75);

        String key = scan.nextLine();
        int value = scan.nextInt();
        checkKeyAndValue(data, key, value);
        scan.close();
    }
}
