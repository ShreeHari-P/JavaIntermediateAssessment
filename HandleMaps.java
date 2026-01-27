import java.util.HashMap;
import java.util.Scanner;

public class HandleMaps{
    public static HashMap<String, Integer> handleMap(HashMap<String, Integer> data, String[] operations){

        for(String s : operations){

            String[] parts = s.split(" ");

            String commands = parts[0];
            String key = parts[1];

            switch (commands) {

                case "GET":
                    if(data.containsKey(key)){
                        System.out.println(data.get(key));
                    }else{
                        System.out.println("Not Found");
                    }
                    break;

                case "PUT":
                    int targetValue = Integer.parseInt(parts[2]);

                    data.put(key, targetValue);
                    break;

                case "REMOVE":
                    data.remove(key);
                    break;
            
                default:
                    break;
            }
        }
        return data;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        HashMap<String, Integer> data = new HashMap<>();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            data.put(key, value);
        }

        scan.nextLine();

        int m = scan.nextInt();
        scan.nextLine();

        String[] operations = new String[m];
        for(int i = 0; i < m; i++){
            operations[i] = scan.nextLine();
        }

        HashMap<String, Integer> result = handleMap(data, operations);
        System.out.println(result);
    }
}