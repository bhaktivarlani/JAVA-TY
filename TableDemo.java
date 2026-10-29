class TableDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            int n = 5;
            for (int i = 1; i <= 10; i++)
                System.out.println(n + " x " + i + " = " + n * i);
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}