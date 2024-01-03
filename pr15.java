import java.util.Scanner;

public class pr15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows from the user
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Display the right-angled triangle pattern
        System.out.println("Right-angled triangle pattern:");

        int counter = 1; // Variable to keep track of the numbers

        for (int i = 1; i <= numRows; i++) {
            // Print numbers in each row (increased by 1)
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
