import java.util.HashSet;

public class CheckProperSubset{
    public static void isProperSubset(HashSet<String> setA, HashSet<String> setB){

        boolean isSubset = setB.containsAll(setA) && !setA.equals(setB);

        System.out.println("SetA is a proper subset of setB: " + isSubset);
    }

    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        setA.add("apple");
        setA.add("banana");

        HashSet<String> setB = new HashSet<>();
        setB.add("apple");
        setB.add("banana");
        setB.add("cherry");

        isProperSubset(setA, setB);
    }
}