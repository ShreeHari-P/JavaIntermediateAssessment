import java.util.*;

public class evenNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scan.nextInt();
        int i = 1;

        while(i <= n){
            if(i%2 != 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        scan.close();

    }
}