import java.util.*;

public class OddOrEvenCounter {
    public static String countEvenOdd(int n){
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        return "Even: "+evenCount +", Odd: "+oddCount;
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String result = countEvenOdd(num);
        System.out.println(result);
        scan.close();
    }
}
