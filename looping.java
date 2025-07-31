public class looping {
    public static void main(String[] args){

      System.out.println("Multiplication (1 - 5)");
      System.out.println("======================");
      System.out.print("   ");
      
      for(int i = 1; i <= 5; i++){
        System.out.printf("%-3d",i);
      }
      System.out.println();

      for(int i = 1; i <= 5; i++){
        System.out.printf("%-3d",i);
        for(int j = 1; j <= 5; j++){
            System.out.printf("%-3d",i*j);
        }
        System.out.println();
      }
    }
}
