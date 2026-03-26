public class ProcessBasedOnType {
    public static String process(Object[] data, String type){
        if(data == null || data.length == 0){
            return "Invalid input";
        }

        return switch(type){

            case "max" -> {
                double max = Double.MIN_VALUE;
                boolean found = false;

                for(Object value : data){

                    if(value instanceof Integer i){
                        if(i > max){
                            max = i;
                        }
                        found = true;
                    }
                    else if(value instanceof Double d){
                        if(d > max){
                            max = d;
                        }
                        found = true;
                    }
                }

                if(!found){
                    yield "No numeric data";
                }

                yield "Max: " + max;
            }

            case "min" -> {
                double min = Double.MAX_VALUE;
                boolean found = false;

                for(Object value : data){

                    if(value instanceof Integer i){
                        if(i < min){
                            min = i;
                        }
                        found = true;
                    }
                    else if(value instanceof Double d){
                        if(d < min){
                            min = d;
                        }
                        found = true;
                    }
                }

                if(!found){
                    yield "No numeric data";
                }

                yield "Min: " + min;
            }

            default -> "Invalid type";
        };
    }

    public static void main(String[] args){
        Object[] data = {10, 29, 33.2, 12.3, 5.6, 18.2, 2.3, 55.7};
        String result = process(data, "max");
        System.out.println(result);
    }    
}
