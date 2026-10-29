
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class exp1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();             // only today's date
        LocalTime time = LocalTime.now();             // only current time
        LocalDateTime dateTime = LocalDateTime.now(); // date and time together

        System.out.println("Current Date  : " + date);
        System.out.println("Current Time  : " + time);
        System.out.println("Date and Time : " + dateTime);
    }
}