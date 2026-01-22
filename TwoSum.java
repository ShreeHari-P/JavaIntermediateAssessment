    import java.util.HashMap;
    import java.util.Arrays;
    public class TwoSum {
        public static int[] sum(int[] arr,int target){
            
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < arr.length; i++){
                
                int complement = target - arr[i];

                if(map.containsKey(complement)){
                    return new int[]{map.get(complement),i};
                }

                map.put(arr[i],i);
            }

            return new int[]{};
        }

        public static void main(String[] args){
            int[] arr = {1, 2, 4, 6, 3, 5, 8, 4, 2, 6, 8};

            int[] result = sum(arr, 13);

            System.out.println("Indices: "+Arrays.toString(result));
        }
    }
