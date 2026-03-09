import java.util.HashSet;
import java.util.Scanner;

public class UniqueLogin {
    public static void registerUsers(String[] users){

        HashSet<String> registeredUsers = new HashSet<>();
        
        for(String user : users){
            registeredUsers.add(user);
        }

        System.out.println("Registered Users: " + registeredUsers);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = scan.nextInt();
        scan.nextLine(); 

        String[] users = new String[n];

        for (int i = 0; i < n; i++) {
            users[i] = scan.nextLine();
        }

        registerUsers(users);

        scan.close();
    }
}
