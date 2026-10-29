class ArraySum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        Thread t1 = new Thread(() -> {
            int sum = 0;
            for (int n : a) sum += n;
            System.out.println("Sum 1: " + sum);
        });
        Thread t2 = new Thread(() -> {
            int sum = 0;
            for (int n : b) sum += n;
            System.out.println("Sum 2: " + sum);
        });
        t1.start();
        t2.start();
    }
}
}
