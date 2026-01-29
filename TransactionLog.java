import java.util.HashMap;
import java.util.Scanner;
public class TransactionLog {
    public static HashMap<String, Integer> transactionManager(HashMap<String, Integer> data, String[] operations){

        for(String s : operations){

            s = s.trim();
            String[] parts = s.split(" ");
            String command = parts[0];
            String key = parts[1];

            if(command.equals("CREDIT")){

                int amount = Integer.parseInt(parts[2]);
                data.put(key, data.getOrDefault(key, 0)+amount);

            }else if(command.equals("DEBIT")){
                int amount = Integer.parseInt(parts[2]);

                if(data.containsKey(key) && data.get(key) >= amount){
                    data.replace(key, data.get(key) - amount);
                }else{  
                    System.out.println("Insufficient balance");
                }

            }else if(command.equals("BALANCE")){
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

        HashMap<String, Integer> result = transactionManager(data, operations);
        System.out.println(result);
        scan.close();
    }
}
