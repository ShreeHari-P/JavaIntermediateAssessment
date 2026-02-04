import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarkReport {
    public static void printStudentMarks(HashMap<String, Integer> marks){

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println("Student: "+entry.getKey() +", Marks: "+entry.getValue());
        }
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> studentMark = new HashMap<>();

        System.out.print("Enter no. of students: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String key = scan.next();
            int value = scan.nextInt();
            studentMark.put(key, value);
        }

        printStudentMarks(studentMark);
        scan.close();
    }
}
