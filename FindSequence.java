public class FindSequence{
    public static void findPattern(int[][] grid, int[] pattern){

        outer: for(int i = 0; i < grid.length; i++){
            inner: for(int j = 0; j < grid[i].length - pattern.length; j++){

                int k;
                for(k = 0; k < pattern.length; k++){
                    if(grid[i][j + k] != pattern[k]){
                        break;
                    }
                }

                if(k == pattern.length){
                    System.out.println("Pattern found at row: " + i + ", starting index: " + j);
                    break outer;
                }
            }
        }
    }

    public static void main(String[] args){
        
        int[][] grid = {
            {5, 1, 2, 3, 9},
            {4, 2, 3, 1, 7},
            {8, 1, 2, 3, 6}
        };

        int[] pattern = {1, 2, 3};

        findPattern(grid, pattern);
    }
}