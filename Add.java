// SUM OF 2 NUMBERS , WITH USER INPUT , EXP 1 MANUAL

import java.util.Scanner; // for user input 
class Add {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
          int a, b, sum;   
          System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
// TO RUN CODE TYPE ON TERMINAL : javac classname.java  & then java classname