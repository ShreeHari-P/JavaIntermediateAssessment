public class BalanceException {
    public static String withdraw(int balance, int amount){

        try{
            if(amount > balance){
                throw new Exception("Insufficient Balance");
            }

            int remaining = balance - amount;
            return "Remaining Balance: " + remaining;
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static void main(String[] args){
        String result = withdraw(0, 0);
        System.out.println(result);
    }
}
