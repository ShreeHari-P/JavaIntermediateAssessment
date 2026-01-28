import java.util.HashMap;
import java.util.Scanner;
public class UpdateScore {
    public static HashMap<String, Integer> updateScore(HashMap<String, Integer> data, String[] operations){

        for(String s : operations){

            String[] parts = s.split(" ");

            String command = parts[0];
            String key = parts[1];

            switch (command) {
                case "CHECK":
                    if(data.containsKey(key)){
                        System.out.println("Exists");
                    }else{
                        System.out.println("Not found");
                    }
                    break;

                case "UPDATE":
                    int value = Integer.parseInt(parts[2]);

                    if(data.containsKey(key)){
                        if(data.get(key) < value){
                            data.replace(key, value);
                        }
                    }else{
                        data.put(key, value);
                    }
                    break;

                case "KEY":
                    System.out.println(data.get(key));
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
        String[] operations = new String[m];
        scan.nextLine();

        for(int i = 0; i < m; i++){
            operations[i] = scan.nextLine();
        }

        HashMap<String, Integer> result = updateScore(data, operations);
        System.out.println(result);
        scan.close();
    }
}
