import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        float a,b,sum,diff,prod,quotient,remainder;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Value:");
            a = sc.nextInt();
            System.out.println("Enter b Value:");
            b = sc.nextInt();
        }

        sum = a+b;
        diff = a-b;
        prod = a*b;
        quotient = a/b;
        remainder = a%b;
        System.out.println("Sum = "+ sum);
        System.out.println("diff = "+ diff);
        System.out.println("prod = "+ prod);
        System.out.println("quotient = "+ quotient);
        System.out.println("remainder = "+ remainder);
        
    }
}
