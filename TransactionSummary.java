import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransactionSummary {
    public static void userBalance(HashMap<String, Integer> account){

        for(Map.Entry<String, Integer> entry : account.entrySet()){
            int balance = entry.getValue();

            if(balance < 0){
                System.out.println("User: " + entry.getKey()
                                    +", Balance: "+entry.getValue() 
                                    + " -> Status: OVERDRAFT");
            }else{
                System.out.println("User: " + entry.getKey()
                                    +", Balance: "+entry.getValue() 
                                    + " -> Status: ACTIVE");
            }
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> account = new HashMap<>();

        System.out.print("Enter number of users: ");
        int n = scan.nextInt();

        System.out.println("Enter user name and balance:");

        for (int i = 0; i < n; i++) {

            String name = scan.next();
            int bal = scan.nextInt();

            account.put(name, bal);
        }

        userBalance(account);

        scan.close();
    }
}
