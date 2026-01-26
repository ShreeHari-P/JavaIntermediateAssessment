import java.util.HashMap;
import java.util.Map;

public class MergeMaps{
    public static HashMap<String, Integer> mergeMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2){

        for(Map.Entry<String, Integer> entry : map2.entrySet()){

            String key = entry.getKey();
            int value = entry.getValue();

            if(map1.containsKey(key)){
                map1.put(key, map1.get(key) + value);
            }else{
                map1.put(key, value);
            }
        }
        return map1;
    }

    public static void main(String[] args){
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A",10);
        map1.put("B",20);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B",30);
        map2.put("C",40);

        System.out.println(mergeMaps(map1, map2));
    }
}