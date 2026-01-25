import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class FilteringByLimit {
    public static HashMap<String, Integer> filterMap(HashMap<String, Integer> data, int limit){

        Iterator<Map.Entry<String, Integer>> iterator = data.entrySet().iterator();

        while(iterator.hasNext()){

            Map.Entry<String, Integer> entry = iterator.next();

            if(entry.getValue() < limit){
                iterator.remove();
            }
        }
        return data;
    }    

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A",3);
        map.put("B",15);
        map.put("C",6);

        HashMap<String, Integer> result = filterMap(map, 10);

        for(String key : result.keySet()){
            System.out.println(key + " -> " + result.get(key));
        }
    }
}
