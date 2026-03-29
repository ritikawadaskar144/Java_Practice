import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int len = password.length();
        String masked = "";

        for (int i = 0; i < len - 2; i++) {
            masked += "*";
        }

        masked += password.substring(len - 2);

        System.out.println("Masked Password: " + masked);
    }
}