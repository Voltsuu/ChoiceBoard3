import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        System.out.println("Enter in your number.");
        if (scan.hasNextInt());
        num = scan.nextInt();

        if(num == 1) {
            System.out.println(num + " is not prime.");
            return;
        }
        for(int i=2;i<=num/2;i++) {
            if(num % i == 0) {
                System.out.println(num + " is not prime.");
                return;
            }
        }
        System.out.println(num + " is prime.");
    }
}