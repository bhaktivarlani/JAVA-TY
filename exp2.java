
// Program 2: Display current date and time using Joda-Time API
// Needs the joda-time jar file
import org.joda.time.DateTime;
import org.joda.time.LocalTime;


public class exp2 {
    public static void main(String[] args) {
        DateTime dateTime = DateTime.now();   // date + time + time zone
        LocalDate date = LocalDate.now();     // only date
        LocalTime time = LocalTime.now();     // only time

        System.out.println("Current DateTime : " + dateTime);
        System.out.println("Current Date     : " + date);
        System.out.println("Current Time     : " + time);
    }
}