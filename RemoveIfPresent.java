import java.util.HashMap;
import java.util.Scanner;
public class RemoveIfPresent {
    public static void safeRemove(HashMap<String, Integer> data,String key){

        if(data.containsKey(key)){
            data.remove(key);
        }else{
            System.out.println("Not found");
        }
        System.out.println(data);
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

        String key = scan.next();
        safeRemove(data, key);
        scan.close();
    }

}
