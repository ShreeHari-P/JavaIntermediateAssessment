public class ValidateVehicleNumber {
    public static String vehicleNumberCheck(String number){

        if(number == null || number.isBlank()){
            return "Invalid input";
        }

        if(number.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}")){
            return "Valid";
        }else{
            return "Invalid";
        }
    }

    public static void main(String[] args){
        String result = vehicleNumberCheck("TN45AZ6556");
        System.out.println(result);
    }
}
