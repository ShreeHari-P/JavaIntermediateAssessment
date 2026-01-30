import java.util.HashMap;
import java.util.Scanner;

public class GetWithNotFoundHandling {
    public static void getValue(HashMap<String, Integer> data, String key){

        if(data.containsKey(key)){
            System.out.println(data.get(key));
        }else{
            System.out.println("Not found");
        }
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
        String checkKey = scan.nextLine();

            getValue(data, checkKey);
        scan.close();
    }
}
