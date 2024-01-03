import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. If the year is not divisible by 4, it is not a leap year.
        // 2. If the year is divisible by 4 but not by 100, it is a leap year.
        // 3. If the year is divisible by 100 but not by 400, it is not a leap year.
        // 4. If the year is divisible by 400, it is a leap year.

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
