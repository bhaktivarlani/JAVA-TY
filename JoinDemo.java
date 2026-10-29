class JoinDemo {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++)
                System.out.println(i);
        });
        t.start();
        t.join();
        System.out.println("Main thread completed");
    }
}