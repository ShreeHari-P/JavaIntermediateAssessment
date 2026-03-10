import java.util.HashSet;

public class LongestSubstring {
    public static void longestUniqueSubstring(String s){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        String result = "";

        for(int right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++; 
            }

            set.add(s.charAt(right));

            if(right - left + 1 > maxLength){
                maxLength = right - left + 1;
                result = s.substring(left, right + 1);
            }
        }
        System.out.println("Longest Unique Substring: " + result);
    }

    public static void main(String[] args) {
    String input = "abcabcbb";
    longestUniqueSubstring(input);
    }
}
