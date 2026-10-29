public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Divide error");
            }

            int a[] = {1, 2};
            System.out.println(a[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        }
    }
} {
    
}
