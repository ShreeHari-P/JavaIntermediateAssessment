import java.util.HashMap;
import java.util.Scanner;
public class ToggleStateMap {
    public static HashMap<String, String> toggle(HashMap<String, String> data, String[] operations){

        for(String s : operations){
            String[] parts = s.split(" ");
            String command = parts[0];
            String key = parts[1];

            if(command.equals("TOGGLE")){

                if(data.containsKey(key)){
                    if(data.get(key).equals("ON")){
                        data.replace(key, "OFF");
                    }else{
                        data.replace(key, "ON");
                    }
                }else{
                    data.put(key, "ON");
                }
            }else if(command.equals("STATUS")){
                if(data.containsKey(key)){
                    System.out.println(data.get(key));
                }else{
                    System.out.println("Not found");
                }
            }
        }
        return data;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> data = new HashMap<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String key = scan.next();
            String value = scan.next();
            data.put(key,value);
        }

        scan.nextLine();

        int m = scan.nextInt();
        String[] operations = new String[m];
        scan.nextLine();

        for(int i = 0; i < m; i++){
            operations[i] = scan.nextLine();
        }

        HashMap<String, String> result = toggle(data, operations);
        System.out.println(result);
        scan.close();
    }
}
