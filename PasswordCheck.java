// Write a Java program to check the password entered by the user with a predefined password using string comparison.

import java.util.Scanner;   // User input

public class PasswordCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creating Scanner object

        String correctPass = "Bhakti08"; 

        System.out.print("Enter Password: ");
        String password = sc.nextLine(); // enter password

        if (password.equals(correctPass)) {
            System.out.println("Password is Correct");
        } else {
            System.out.println("Incorrect Password");
        }

        sc.close(); 
    }
}