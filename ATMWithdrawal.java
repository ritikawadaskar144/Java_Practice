import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful");
                System.out.println("Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}