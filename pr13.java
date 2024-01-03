import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer from the user
        System.out.print("Enter an integer to display its multiplication table: ");
        int number = scanner.nextInt();

        // Display the multiplication table
        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

