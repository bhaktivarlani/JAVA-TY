class LambdaMultiple {
    public static void main(String[] args) {
        java.util.function.BiFunction<Integer, Integer, Integer> add =
            (a, b) -> a + b;
        System.out.println(add.apply(10, 20));
    }
}
