import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a value");
            a = sc.nextInt();
            System.out.println("Enter b value");
            b = sc.nextInt();
            System.out.println("Enter c value");
            c = sc.nextInt();
        }
        if (a < b) {
            if (a < c) {
                System.out.println("Lowest Number = " + a);
            } else {
                System.out.println("Lowest Number = " + c);
            }

        } else {
            if (b < c) {
                System.out.println("Lowest Number = " + c);

            } else {
                System.out.println("Lowest Number = " + b);

            }

        }
    }

}
