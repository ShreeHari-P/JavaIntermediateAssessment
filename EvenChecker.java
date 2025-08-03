import java.util.Scanner;
public class EvenChecker {
    public static void isEven(int n){
        if(n%2 == 0){
            System.out.println(n + " is Even...");
        } else{
            System.out.println(n + " is Odd...");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for(int i = 0; i < count; i++){
            System.out.println("Enter Number to check whether odd or even: ");
            int num = scan.nextInt();
            isEven(num);
        }
        scan.close();
    }
}
