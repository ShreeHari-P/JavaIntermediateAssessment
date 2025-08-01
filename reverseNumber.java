import java.util.*;
public class reverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int product = 0;

        while (n != 0){
            int digit = n % 10;
            product = product * 10 + digit;
            n /= 10;
        }
        System.out.println(product);
        scan.close();
    }    
}
