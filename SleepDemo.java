class SleepDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 10; i <= 20; i++) {
                System.out.println(i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 20; i <= 30; i++) {
                System.out.println(i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });
        t1.start();
        t2.start();
    }
}
