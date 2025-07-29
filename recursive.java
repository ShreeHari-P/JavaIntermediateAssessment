public class recursive{
    public static void main(String[] args){
        printPattern(3);
    }

    public static void printPattern(int n){

        if(n < 1) return;

        System.out.print(n + " ");

        printPattern(n - 1);

        System.out.print(n + " ");
    }
}