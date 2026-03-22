import java.util.HashSet;

public class RemoveCommonElement {
    public static void removeCommonElements(HashSet<Integer> set1, HashSet<Integer> set2){

        HashSet<Integer> setDiff1 = new HashSet<>(set1);
        HashSet<Integer> setDiff2 = new HashSet<>(set2);

        setDiff1.removeAll(set2);
        setDiff2.removeAll(set1);

        setDiff1.addAll(setDiff2);
        System.out.println("Common elements removal, then: " + setDiff1);
    }    

    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(2);
        set2.add(5);
        removeCommonElements(set1, set2);
    }
}
