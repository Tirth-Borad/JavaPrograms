import java.util.Scanner;

public class pr9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first floating-point number
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        // Input the second floating-point number
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Round both numbers to three decimal places
        double roundedNum1 = roundToThreeDecimalPlaces(num1);
        double roundedNum2 = roundToThreeDecimalPlaces(num2);

        // Compare the rounded numbers for equality
        if (roundedNum1 == roundedNum2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
    }

    // Function to round a number to three decimal places
    private static double roundToThreeDecimalPlaces(double num) {
        return Math.round(num * 1000.0) / 1000.0;
    }
}