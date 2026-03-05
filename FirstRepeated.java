import java.util.Scanner;
import java.util.HashSet;

public class FirstRepeated {
    public static void firstRepeated(String[] arr){

        HashSet<String> hash = new HashSet<>();

        for(String s : arr){
            
            if(hash.contains(s)){
                System.out.println("First Repeated Word: " + s);
                return;
            }else{
                hash.add(s);
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements separated by space: ");
        String[] str = scan.nextLine().split(" ");

        firstRepeated(str);
        scan.close();
    }
}
