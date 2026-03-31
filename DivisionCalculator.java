import java.util.*;

class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}