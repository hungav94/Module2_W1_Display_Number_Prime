import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number");
        int number = scanner.nextInt();
        int n = 2;
        boolean check;
        System.out.println(number + " number first prime: ");
        for (int count = 1; count <= number; ) {
            check = isPrime(n);
            if (check) {
                System.out.println(count + ": " + n);
                count++;
            }
            n++;
        }
    }
}
