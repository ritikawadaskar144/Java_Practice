import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        // Case-sensitive
        if (name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are NOT equal (case-sensitive)");
        }

        // Case-insensitive
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are NOT equal (case-insensitive)");
        }
    }
}