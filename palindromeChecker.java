import java.util.*;

public class palindromeChecker {
    public static boolean isPalindrome(String word){
        String cleanWord = word.replaceAll("\\s+", " ").toLowerCase();

        String reversed = new StringBuilder(cleanWord).reverse().toString();

        return cleanWord.equals(reversed);
    }    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String testWord = scan.nextLine();
        boolean result = isPalindrome(testWord);
        System.out.println("Is a\""+testWord+"\" a palindrome?" + result);
        scan.close();
    }
}
