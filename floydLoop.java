public class floydLoop{
    public static void main(String[] args){
        int countNumber = 1;

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(countNumber + " ");
                countNumber++;
            }
            System.out.println();
        }
    }
}