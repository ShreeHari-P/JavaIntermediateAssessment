import java.util.Scanner;

public class pattern{
    public static void printPattern(int n){
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();

        for(int i = 0; i <= lines; i++){
            printPattern(i);
            System.out.println();
        }
        scan.close();
    }
}