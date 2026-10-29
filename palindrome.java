import java.util.Scanner;   // Used to take input from the user

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter a String: ");
        String str = sc.nextLine(); // User enters the string

        String rev = ""; // Variable to store the reversed string

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Compare original string with reversed string
        if (str.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }

        sc.close(); // Close Scanner
    }
}