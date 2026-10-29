public class multiplecatch {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2};
            System.out.println(a[5]);
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        }
    }
} {
    
}
