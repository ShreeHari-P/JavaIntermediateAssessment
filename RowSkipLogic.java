public class RowSkipLogic {
    public static void rowSkip(int[][] grid){

        outer: for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){

                if(grid[i][j] == -1){
                    continue outer;
                }
            }
            
            for(int j = 0; j < grid[i].length; j++){
                     System.out.println("The index: " + i +"," + j + ", The Value: " + grid[i][j]);
            }
        }
    }
    public static void main(String[] args){

        int[][] grid = {
            {1, -1, 1},
            {1, 2, 2},
            {3, 2, -1}
        };

        rowSkip(grid);
    }
}
