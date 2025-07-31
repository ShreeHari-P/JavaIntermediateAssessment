import java.util.*;

public class tableMultiplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum = n*i;
            System.out.printf("%-3dX %-3d=%3d",i,n,sum);
            System.out.println();
        }
        scan.close();
        
    }    
}
