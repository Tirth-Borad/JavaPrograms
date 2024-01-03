import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Value");
            a = sc.nextInt();
        }
        if (a%2==0) {
            System.out.println("Numebr is even");
            
        }


        
    }

}
