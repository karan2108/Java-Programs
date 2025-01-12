// Find Largest Among three numbers

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        // Create scanner object for user input 
        Scanner scanner = new Scanner(System.in);

        System.out.pirntln("Enter 1st number : ");
        double n1 = scanner.nextDouble;

        System.out.pirntln("Enter 2nd number : ");
        double n2 = scanner.nextDouble;

        System.out.pirntln("Enter 3rd number : ");
        double n3 = scanner.nextDouble;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
