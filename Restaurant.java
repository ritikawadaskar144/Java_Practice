class Restaurant {
    boolean foodReady = false;

    synchronized void produce() throws InterruptedException {
        while (foodReady)
            wait();
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!foodReady)
            wait();
        System.out.println("Waiter served food");
        foodReady = false;
        notify();
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            try {
                r.produce();
            } catch (Exception e) {
            }
        });

        Thread waiter = new Thread(() -> {
            try {
                r.consume();
            } catch (Exception e) {
            }
        });

        chef.start();
        waiter.start();
    }
}