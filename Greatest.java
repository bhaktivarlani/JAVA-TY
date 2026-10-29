// GREATEST OF 3 NUMBER , WITH CONDITIONAL STATEMENT ,Exp1  MANUAL 
import java.util.Scanner; // for user input
public class Greatest {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Greatest number is: " + a);

        } else if (b > c) {
            System.out.println("Greatest number is: " + b);

        } else {
            System.out.println("Greatest number is: " + c);
        }
    }
    
}
