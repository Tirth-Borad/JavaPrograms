import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a single character: ");
        String userInput = scanner.nextLine();

        // Check if the input is a single character
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            char inputChar = Character.toLowerCase(userInput.charAt(0));

            // Check if the character is a vowel or consonant
            if (isVowel(inputChar)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Please enter a single alphabetical character.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
