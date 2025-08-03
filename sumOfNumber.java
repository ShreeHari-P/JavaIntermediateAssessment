import java.util.*;

public class sumOfNumber {
    public static void sumUptoN(int N){
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.println("Sum of 1 to "+N+" is: "+sum);
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        sumUptoN(num);
        scan.close();
    }
}
