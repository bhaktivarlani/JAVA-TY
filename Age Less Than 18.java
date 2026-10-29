import java.util.*;

class AgeLessThan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18)
                throw new Exception("Age is less than 18");
            System.out.println("Age is valid");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}