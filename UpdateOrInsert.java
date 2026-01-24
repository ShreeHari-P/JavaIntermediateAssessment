import java.util.HashMap;

public class UpdateOrInsert {
    public static HashMap<String, Integer> scoreData(HashMap<String, Integer> score, String key, Integer newValue){

        if(score.containsKey(key)){
            score.replace(key, score.get(key)+newValue);
        }else{
            score.put(key, newValue);
        }
        
        return score;
    }

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Tom",10);
        map.put("Sam",20);

        HashMap<String, Integer> result = scoreData(map, "Tom",5);

        for(String key : result.keySet()){
            System.out.println(key +" -> "+ result.get(key));
        }
    }
}
