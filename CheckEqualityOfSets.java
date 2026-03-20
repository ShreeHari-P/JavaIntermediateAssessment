import java.util.HashSet;

public class CheckEqualityOfSets {
    public static void areSetsEqual(HashSet<Integer> set1, HashSet<Integer> set2){

        boolean isEqual = set1.containsAll(set2) && set2.containsAll(set1);
        System.out.println("Sets are Equal: " + isEqual);
    }

    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(4);
        areSetsEqual(set1, set2);
    }
}
