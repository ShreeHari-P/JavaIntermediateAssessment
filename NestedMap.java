import java.util.HashMap;

public class NestedMap{
    public static void main(String[] args){
        HashMap<String, HashMap<String, Integer>> studentMarks = new HashMap<>();
        
        HashMap<String, Integer> rahul = new HashMap<>();
        rahul.put("Maths",90);
        rahul.put("Science",85);

        HashMap<String, Integer> anita = new HashMap<>();
        anita.put("Maths",95);
        anita.put("Science",88);

        studentMarks.put("Rahul",rahul);
        studentMarks.put("Anita",anita);

        for(String student : studentMarks.keySet()){
            
            System.out.println("Student: " + student);

            HashMap<String, Integer> subjects = studentMarks.get(student);

            for(String subject : subjects.keySet()){
                System.out.println("  Subject: " + subject + 
                            ", Marks: " + subjects.get(subject));
            }
        }
    }
}