public class multiplicationTableSkipper {
    public static void main(String[] args){
        int num = 7;
    
        for(int i = 1; i<=10;i++){
            if(i == 5){
                continue;
            }
            if(i > 8){
                break;
            }
            System.out.println(i +" x "+num+" = "+num*i);
        }
    }    
}
