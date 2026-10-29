class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Result = " + a);
        }
        catch (Exception e) {
            System.out.println("Error occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
