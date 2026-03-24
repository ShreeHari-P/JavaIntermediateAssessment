public class SkipDiagonal {
    public static void skipDiagonal(int[][] grid){

        int n = grid.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(i == j || i + j == n - 1){
                    continue;
                }

                System.out.println("Value: " + grid[i][j]);
            }
        }
    }

    public static void main(String[] args){
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        skipDiagonal(grid);
    }
}
