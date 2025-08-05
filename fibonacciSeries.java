import java.util.Scanner;

public class fibonacciSeries{
    public static void printFibonacci(int terms){
        if(terms <= 0){
            System.out.println("Enter a Positive natural number...");
            return;
        }

        System.out.println("Fibonacci series "+terms+" terms");

        int a = 0, b = 1;
        for(int i = 1; i <= terms; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scan.nextInt();
        printFibonacci(terms);
        scan.close();
    }
}