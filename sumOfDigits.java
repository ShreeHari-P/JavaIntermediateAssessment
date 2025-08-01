import java.util.*;

public class sumOfDigits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        while (n != 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
        scan.close();
    }
}