public class recursionPattern {
    public static void main(String[] args){
        int n = 3;
        printPattern(3);
    }

    public static void printPattern(int num){
        if(num < 1) return;

        System.out.print(num + " ");

        printPattern(num - 1);

        System.out.print(num + " ");
    }
}
