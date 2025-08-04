import java.util.Scanner;

public class primeChecker{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        } else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            } 
            return true;
        }
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count to check prime...");
        int count = scan.nextInt();

        for(int i = 1; i <= count; i++){
            System.out.print("Enter a Number: ");
            int num = scan.nextInt();
            boolean primeOrNot = isPrime(num);
            if(primeOrNot){
                System.out.println(num + " is a Prime Number...");
            } else{
                System.out.println(num + " is not a Prime Number...");
            }
        }
        scan.close();
    }
}