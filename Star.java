// PRINT STAR PATTERN USING NESTED LOOPS  , EXP 1 MANUAL

public class Star {
    
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
