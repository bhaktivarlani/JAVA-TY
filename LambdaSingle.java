class LambdaSingle {
    public static void main(String[] args) {
        java.util.function.Consumer<Integer> c =
            n -> System.out.println(n);
        c.accept(10);
    }
}
