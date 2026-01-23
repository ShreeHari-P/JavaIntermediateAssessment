import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num){

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scan.nextInt();

        if(isArmstrong(n)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        scan.close();
    }    
}
