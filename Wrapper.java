import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer as a String: ");
        String str = sc.nextLine();

        Integer obj = Integer.valueOf(str);

        int num = obj;

        System.out.println("Original String : " + str);
        System.out.println("Wrapper Object  : " + obj);
        System.out.println("Primitive Value : " + num);

        sc.close();
    }
}