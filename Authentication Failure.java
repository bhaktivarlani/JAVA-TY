.import java.util.*;

class AuthenticationFailure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        try {
            if (!pass.equals("1234"))
                throw new Exception("Authentication Failure!");
            System.out.println("Correct Password");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}