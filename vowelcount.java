
import java.util.Scanner;   
public class vowelcount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a String: ");
        String str = sc.nextLine(); 

        int count = 0; // Variable to store the number of vowels

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Number of Vowels = " + count);

        sc.close();
    }
} 
