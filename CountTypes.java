public class CountTypes{
    public static String countTypes(Object[] data){

        int i = 0, d = 0, s = 0;

        if(data == null || data.length == 0)
            return "Invalid Input";

        for(Object value : data){
            if(value instanceof Integer num){
                i++;
            }
            else if(value instanceof Double decimal){
                d++;
            }
            else if(value instanceof String str){
                s++;
            }
        }

        return "Integer: " + i +", Double: " + d + ",String: " + s;
    }

    public static void main(String[] args){
     
        Object[] data = {1, 12.4, 2, 44.5, "Hi", "22", 9, "What", "Like",};
        String result = countTypes(data);
        System.out.println(result);
    }
}