import java.util.*;
public class primeNumber {
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(isPrime(number)){
            System.out.println("Output: Prime...");
        } else{
            System.out.println("Output: Not Prime...");
        }
        scan.close();
    }

        public static boolean isPrime(int number){

            if(number <= 1){
                return false;
            } else{
                for(int i = 2; i <= Math.sqrt(number); i++){
                    if(number%i == 0){
                        return false;
                    }
                }
            }
        
        return true;
        
        }
}

