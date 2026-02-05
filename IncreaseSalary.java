import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class IncreaseSalary {
    public static void increaseSalary(HashMap<String, Integer> salary){

        for(Map.Entry<String, Integer> entry : salary.entrySet()){
            int currentSalary = entry.getValue();

            if(currentSalary < 30000){
                int newSalary = currentSalary + (currentSalary * 10/100);

                entry.setValue(newSalary);
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> salary = new HashMap<>();

        System.out.print("Enter no.of employee: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            String emp = scan.next();
            int sal = scan.nextInt();
            salary.put(emp, sal);
        }

        increaseSalary(salary);

        System.out.println("Updated Salary List: ");
        for(Map.Entry<String, Integer> entry : salary.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        scan.close();
    }
}
