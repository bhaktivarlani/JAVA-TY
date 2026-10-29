class LambdaNoParameter {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Java");
        r.run();
    }
}
