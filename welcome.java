import java.util.*;

public class welcome {
    public static void greetings(String name){
        System.out.println("Welcome " + name + "!");
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of people you want to greet...");
        int count = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < count; i++){
            System.out.println("Enter Name "+(i + 1)+": ");
            String name = scan.nextLine();
            greetings(name);
        }
        scan.close();
    }
}
