class BankingSystem {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Thread t1 = new Thread(() -> b.withdraw(200));
        Thread t2 = new Thread(() -> b.withdraw(300));

        t1.start();
        t2.start();
    }
}