// SUM OF DIGITS OF AN INTEGER , EXP 1 MANUAL

import java.util.Scanner; // for user input
public class Sumofdigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        while (num != 0) {
            sum += num % 10; // add the last digit to sum
            num /= 10; // remove the last digit from num
        }
        System.out.println("Sum of digits is: " + sum);
    }
}   
