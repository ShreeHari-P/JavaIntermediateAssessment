import java.util.HashSet;

public class SymmetricDifference {
    public static void symmetricDiff(HashSet<Integer> set1, HashSet<Integer> set2){
        
        HashSet<Integer> diff1 = new HashSet<>(set1);
        HashSet<Integer> diff2 = new HashSet<>(set2);
        diff1.removeAll(set2);
        diff2.removeAll(set1);

        diff1.addAll(diff2);
        System.out.println("Symmetric Difference: " + diff1);
    }
    public static void main(String[] args){

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        symmetricDiff(setA, setB);
    }
}
