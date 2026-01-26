import java.util.HashMap;

public class SwapValues {
    public static HashMap<String, Integer> swapValues(HashMap<String, Integer> data, String key1, String key2){

        if(data.containsKey(key1) && data.containsKey(key2)){

            int temp = data.get(key1);
            data.put(key1, data.get(key2));
            data.put(key2,temp);
        }

        return data;
    }   

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A",10);
        map.put("B",20);
        map.put("C",30);

        System.out.println(swapValues(map, "A", "B"));
        System.out.println(swapValues(map, "A", "D"));
    }
}
