import java.util.*;

public class simpleInterestCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter Time(In years): ");
        double time = scan.nextDouble();

        if(principal <= 0 || rate <= 0 || time <= 0){
            System.out.println("Error: Enter Positive Numbers...");
            return;
        }

        double interest = (double)(principal * rate * time) / 100;

        System.out.printf("The Principal Amount is: %.2f\n",principal);
        System.out.printf("The Interest Rate is: %.2f\n",rate);
        System.out.printf("The Time(In Years): %.2f\n",time);
        System.out.printf("The Interest Rate is: %3.2f\n",interest);
        System.out.printf("The Total Amount is: %3.2f\n",principal + interest);
        scan.close();
    }
}