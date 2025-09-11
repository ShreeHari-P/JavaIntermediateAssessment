import java.util.*;
public class cubeVolumeChecker {
    
    static int a;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        if(a > 0){
            flag = true;
        } else {
            flag = false;
            System.out.println("Error");
        }
        scan.close();
    }

    public static void main(String[] args){
        if(flag){
            double volume = Math.pow(a , 3);
            System.out.println("Volume of Cube: "+volume);
        }
    }

}

