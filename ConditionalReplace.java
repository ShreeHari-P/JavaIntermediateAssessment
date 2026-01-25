import java.util.HashMap;
public class ConditionalReplace {
    public static HashMap<String, Integer> conditionalCheck(HashMap<String, Integer> map, String key, int value){

        if(map.containsKey(key) && value % 2 == 0){
            map.replace(key, value*2);
        }else if(map.containsKey(key) && value != 0){
            map.remove(key);
        }else{
            map.put(key, value);
        }
        
        return map;
    }

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        System.out.println(map);
        System.out.println(conditionalCheck(map, "One", 1));    //remove
        System.out.println(conditionalCheck(map, "Four", 4));    //replace
        System.out.println(conditionalCheck(map, "Seven", 7));    //insert
    }
}
