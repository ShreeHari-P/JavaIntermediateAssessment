import java.util.*;

public class gradeCalculator {
    public static String grade(int n){
        if(n >= 90 && n <= 100){
            return "Grade A";
        } else if(n >= 80 && n <= 89){
            return "Grade B";
        } else if(n >= 70 && n <= 79){
            return "Grade C";
        } else{
            return "Fail";
        }
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt();
        for(int i = 1; i <= students; i++){
            int mark = scan.nextInt();
            String result = grade(mark);
            System.out.println(result);
            
        }
        scan.close();
    }
}
