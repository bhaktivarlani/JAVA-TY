class LambdaCalculator {
    public static void main(String[] args) {
        java.util.function.IntBinaryOperator add = (a, b) -> a + b;
        java.util.function.IntBinaryOperator sub = (a, b) -> a - b;
        java.util.function.IntBinaryOperator mul = (a, b) -> a * b;
        java.util.function.IntBinaryOperator div = (a, b) -> a / b;

        System.out.println(add.applyAsInt(10, 5));
        System.out.println(sub.applyAsInt(10, 5));
        System.out.println(mul.applyAsInt(10, 5));
        System.out.println(div.applyAsInt(10, 5));
    }
}