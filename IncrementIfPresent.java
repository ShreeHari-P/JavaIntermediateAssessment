import java.util.HashMap;

public class IncrementIfPresent {
    public static HashMap<String, Integer> incrementByPresent(HashMap<String, Integer> data, String key){

        if(data.containsKey(key)){
            data.replace(key, data.get(key)+1);
        }else{
            data.put(key, data.getOrDefault(key, 0)+1);
        }

        return data;
    }
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Hi",2);
        map.put("Hey",3);
        map.put("Hello",5);

        HashMap<String, Integer> result = incrementByPresent(map, "Hey");
        result = incrementByPresent(map, "Dude");

        System.out.println(result);
    }
}
