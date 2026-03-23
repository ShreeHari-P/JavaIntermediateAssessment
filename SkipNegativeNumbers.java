    public class SkipNegativeNumbers {
        public static void skipNegative(int[][] grid){

            outer: for(int i = 0; i < grid.length; i++){
                inner: for(int j = 0; j < grid[i].length; j++){

                    if(grid[i][j] < 0){
                        continue inner; //continue is enough, already we are in inner loop
                    }

                    System.out.println("The non-negative values: " + grid[i][j]);

                }
            }
        }

        public static void main(String[] args){
            int[][] grid = {
                {-1, 2, -3, 4},
                {-6, 7, 9, 10},
                {-2, 1, 6, -9}
            };

            skipNegative(grid);
        }
    }
