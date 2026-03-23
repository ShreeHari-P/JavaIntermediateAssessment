public class CountOccurrences {
    public static int countOccurrences(int[][] grid, int target){

        int count = 0;

        outer: for(int i = 0; i < grid.length; i++){
            inner: for(int j = 0; j < grid[i].length; j++){

                if(grid[i][j] == target){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){
        
        int[][] grid = {
            {1, 2, 3},
            {1, 2, 4},
            {3, 4, 6}
        };

        int result = countOccurrences(grid, 2);
        System.out.println("Target appears: " + result +" times.");
    }
}
