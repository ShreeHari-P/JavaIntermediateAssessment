public class FindFirstEven {
    public static void firstEven(int[][] grid){

        outer: for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){

                if(grid[i][j] % 2 == 0){
                    System.out.println("The first even number: " + grid[i][j]);
                    break outer;
                }
            }
        }
    }

    public static void main(String[] args){
        int[][] grid = {
            {1, 3, 5, 7},
            {3, 5, 7, 9},
            {3, 2, 9, 10}
        };

        firstEven(grid);
    }
}
