
// Program 4: Display day of week, month and year of a given date (Java Time API)
import java.time.LocalDate;

public class exp4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 10, 8);   // the given date

        System.out.println("Date         : " + date);
        System.out.println("Day of week  : " + date.getDayOfWeek());  // e.g. THURSDAY
        System.out.println("Month        : " + date.getMonth());      // e.g. OCTOBER
        System.out.println("Month number : " + date.getMonthValue()); // e.g. 10
        System.out.println("Year         : " + date.getYear());       // e.g. 2026
    }
}
