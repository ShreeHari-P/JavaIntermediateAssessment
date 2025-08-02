import java.util.*;

public class PinValidation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int password = 1234;

        while(true){
            int confrimPassword = scan.nextInt();

            if(confrimPassword == password){
                System.out.println("Access Granted...");
                break;
            } else{
                System.out.println("Incorrect Password, Try again...");
            }
        }
        scan.close();
    }
}