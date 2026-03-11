import java.util.HashSet;

public class CheckPangram{
    public static void isPangram(String s){
        
        HashSet<Character> set = new HashSet<>();

        s = s.toLowerCase();

        for(char ch : s.toCharArray()){

            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }

        if(set.size() == 26){
            System.out.println("Pangram");
        }else{
            System.out.println("Not Pangram");
        }
    }

    public static void main(String[] args){
        String sentence = "The quick brown fox jumps over the lazy dog";
        isPangram(sentence);
    }
}