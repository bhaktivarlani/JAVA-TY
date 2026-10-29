public class ThreeThreads {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("12345")).start();
        new Thread(() -> System.out.println("ABCDE")).start();
        new Thread(() -> System.out.println("@#$%&")).start();
    }
} {
    
}
