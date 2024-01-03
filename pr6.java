import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        double km,miles;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter km");
            km = sc.nextDouble();
        }
        miles = km * 0.621371;
        System.out.println(km + " KM = "+miles+" Miles");
    }
    
}
