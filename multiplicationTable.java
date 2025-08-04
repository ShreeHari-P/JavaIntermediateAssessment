import java.util.Scanner;
public class multiplicationTable {
    public static void printTable(int num){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%3d x %2d = %-3d",i,num,i*num);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Tables you want to print...");
        int count = scan.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.print("Enter Table: ");
            int n = scan.nextInt();
            printTable(n);
        }
    }
}
