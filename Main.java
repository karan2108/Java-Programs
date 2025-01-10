import java.util.Scanner;

public class Main {
  public static void main(String [] args) {
    // Create a scanner object to read input
    Scanner scanner = new Scanner(System.in);

    // Read two integers from the users 
    System.out.print("Enter 1st number: ");
    int a = scanner.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = scanner.nextInt();

    // Addition operation 
    int add = a + b;

    // Subtraction operation
    int sub = a - b;

    // Multiplication operation
    int mul = a * b;

    // Division operation
    int div = a / b;

    // Modulus operation
    int modulus = a % b;
    
    // Result 
    System.out.println("Addition result: " + add);
    System.out.println("Substraction result: " + sub);
    System.out.println("Multiplication result: " + mul);
    System.out.println("Division result: " + div);
    System.out.println("Modulus result: " + modulus);

  }
}
