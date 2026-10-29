class ThreadTransfer {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++)
                System.out.println(i);
        });
        Thread t2 = new Thread(() -> {
            try { t1.join(); } catch (Exception e) {}
            for (int i = 10; i >= 1; i--)
                System.out.println(i);
        });
        t1.start();
        t2.start();
    }
}