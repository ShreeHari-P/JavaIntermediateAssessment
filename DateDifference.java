import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import java.time.Period;

public class DateDifference{
    public static String calculateDateDifference(String start, String end){

        try{
            LocalDate startDate = LocalDate.parse(start);
            LocalDate endDate = LocalDate.parse(end);

            Period period = Period.between(startDate, endDate);

            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            return "Years: " + years + ", Months: " + months + ", Days: " + days;

        }
        catch(DateTimeParseException e){
            return "Invalid input";
        }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String start = scan.nextLine();
        String end = scan.nextLine();

        String result = calculateDateDifference(start, end);
        System.out.println(result);
    }
}