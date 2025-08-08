public class distanceConverter {
    public static double convertDistance(double kilometers){
        return kilometers * 0.621371;
    }    

    public static int convertDistance(int meters){
        return meters / 1000;
    }

    public static double convertDistance(double value, String unit){
        switch(unit.toLowerCase()){
            case "km":
                return value * 0.621371; //km to miles

            case "miles":
                return value * 1.60934; //miles to km

            case "meters":
                return value / 1000; //meters to km

            case "kmtometer":
                return value * 1000; //km to meter

            case "milestometer":
                return value * 1609.34; //miles to meter

            case "metertokm":
                return value / 1000.0; //meter to km

            case "metertomiles":
                return value * 0.000621371; //meter to miles

            default:
                throw new UnsupportedOperationException("Unsupported unit conversation");
        }
    }

    public static void main(String[] args){
        System.out.println("10 Km in miles: "+convertDistance(10.0));
        System.out.println("1000 meters in km: "+convertDistance(1000));
        System.out.println("10 km in miles: "+convertDistance(10,"km"));
        System.out.println("10 miles in km: "+convertDistance(10,"miles"));
        System.out.println("1000 meters in km: "+convertDistance(1000,"metertokm"));
        System.out.println("1 km to meters: "+convertDistance(1,"kmtometer"));
    }
}
