
// Program 5: Add and subtract days, months, years using Joda-Time API
// joda-time jar file
import org.joda.time.LocalDate;

public class exp5 {
    public static void main(String[] args) {
        LocalDate date = new LocalDate(2026, 10, 8);  // the given date
        System.out.println("Original Date : " + date);

        // Joda objects are immutable, so each method returns a NEW date
        System.out.println("After adding 10 days       : " + date.plusDays(10));
        System.out.println("After adding 2 months      : " + date.plusMonths(2));
        System.out.println("After adding 1 year        : " + date.plusYears(1));

        System.out.println("After subtracting 5 days   : " + date.minusDays(5));
        System.out.println("After subtracting 3 months : " + date.minusMonths(3));
        System.out.println("After subtracting 2 years  : " + date.minusYears(2));
    }
}