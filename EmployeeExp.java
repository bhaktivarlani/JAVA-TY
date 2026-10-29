import java.time.LocalDate;               // for working with dates
import java.time.Period;                  // for finding gap between two dates
import java.time.format.DateTimeFormatter; // for formatting dates
import java.util.Scanner;                 // for taking input

class EmployeeExp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
         // create Scanner for input

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();         
          // read name

        System.out.print("Enter joining date (dd-MM-yyyy): ");
        String input = sc.nextLine();         
         // read date as text

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // set date format

        LocalDate joiningDate = LocalDate.parse(input, format); // convert text to date
        LocalDate today = LocalDate.now();                      // get today's date

        Period exp = Period.between(joiningDate, today); 
        // find difference between dates

        // print everything
        System.out.println("\nName: " + name);
        System.out.println("Joining Date: " + joiningDate.format(format)); // show in dd-mm-yyyy
        System.out.println("Today's Date: " + today.format(format));
        System.out.println("Experience: " + exp.getYears() + " years, "
                + exp.getMonths() + " months, " + exp.getDays() + " days");

        sc.close();  // close scanner
    }
}