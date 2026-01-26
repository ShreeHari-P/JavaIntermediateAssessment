import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class RemoveOnMatch {
    public static HashMap<String, Integer> removeOnMatch(HashMap<String, Integer> data, int value){

        Iterator<Map.Entry<String, Integer>> iterator = data.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();

            if(entry.getValue() == value){
                iterator.remove();
            }
        }

        return data;
    }
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A",10);
        map.put("B",20);
        map.put("C",10);
        map.put("D",40);

        System.out.println(removeOnMatch(map, 10));
    }
}
