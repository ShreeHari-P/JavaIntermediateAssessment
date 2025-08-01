import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int product = 1;

        while (n > 0){
            product *= n;
            n--;
        }

        System.out.println(product);
        scan.close();
    }
}