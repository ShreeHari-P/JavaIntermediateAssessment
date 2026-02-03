import java.util.HashMap;
import java.util.Scanner;

public class ClearIfSizeExceedLimit {
    public static void clearIfLimitExceeded(HashMap<String, Integer> data, int limit){

        if(data.size() > limit){
            data.clear();
        }

        System.out.println("Is the Map is Empty: "+data.isEmpty());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            data.put(key, value);
        }

        scan.nextLine();
        System.out.print("Enter a Limit: ");
        int limit = scan.nextInt();
        clearIfLimitExceeded(data, limit);
        scan.close();
    }
}
