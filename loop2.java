public class loop2 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");
        
        // Write your nested loops here
        // Print header row
        System.out.print("  ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        
        // Print table rows
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%-3d", i * j);
            }
            System.out.println();
        }
            System.out.println();
        }
   }
