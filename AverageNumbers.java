public class AverageNumbers {
    public static String averageNumbers(Object[] data){

        double sum = 0;

        if(data == null || data.length == 0){
            return "Invalid input";
        }

        for(Object value : data){
            if(value instanceof Integer num){
                sum += num;
            }
            if(value instanceof Double d){
                sum += d;
            }
        }

        if(sum != 0){
            return "Sum of Numeric Value: " + sum;
        }else{
            return "No Numeric data";
        }
    }
    public static void main(String[] args){

        Object[] data = {"Hii", 22.5, 10, "Hello", 30, "String", 4.5};
        String result = averageNumbers(data);
        System.out.println(result);
    }
}
