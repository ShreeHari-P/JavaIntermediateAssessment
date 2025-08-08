import java.util.*;

public class interestCalculator {
    public static double calculateInterest(double principal, double rate){
        return principal * rate / 100;
    }

    public static double calculateInterest(double principal, double rate, int years){
        return principal * rate * years / 100;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter Years: ");
        int years = scan.nextInt();
        System.out.println(calculateInterest(principal, rate));
        System.out.println(calculateInterest(principal, rate, years));
        scan.close();
    }
}
