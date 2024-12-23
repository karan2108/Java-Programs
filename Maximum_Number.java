import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        // User inputs
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Write your code here
        int larger = num1 > num2 ? num1 : num2;
        System.out.println("\nMaximum Number: " + larger);
    }
}
