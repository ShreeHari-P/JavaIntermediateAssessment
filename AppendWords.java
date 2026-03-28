import java.util.Scanner;

public class AppendWords {
    public static String buildSentence(String a, String b){

        if(a == null || b == null)
            return "Invalid input";

        StringBuilder sb = new StringBuilder();
        sb.append(a.trim());
        sb.append(" ");
        sb.append(b.trim());
        sb.append(".");

        return sb.toString();
    }

    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();

        String result = buildSentence(a, b);
        System.out.println(result);
        scan.close();
    }
}
