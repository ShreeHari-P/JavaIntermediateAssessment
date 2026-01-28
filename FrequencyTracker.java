import java.util.HashMap;
import java.util.Scanner;
public class FrequencyTracker {
    public static HashMap<String, Integer> processFrequency(HashMap<String, Integer> data, String[] operations){

        for(String s : operations){

            String[] parts = s.split(" ");

            String command = parts[0];
            String key = parts[1];

            switch (command) {
                case "ADD":
                    if(data.containsKey(key)){
                        data.put(key, data.getOrDefault(key, 0)+1);
                    }else{
                        data.put(key, 1);
                    }
                    break;

                case "COUNT":
                    if(data.containsKey(key)){
                        System.out.println(data.get(key));
                    }
                    break;

                case "DELETE":
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

        HashMap<String, Integer> data = new HashMap<>();
        int n = scan.nextInt();

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

        HashMap<String, Integer> result = processFrequency(data, operations);
        System.out.println(result);
        scan.close();
    }
}
