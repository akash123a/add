import java.util.Scanner;

public class NprimeNumber {

    // Method to check if a number is prime
    public static boolean prime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime

        // Check divisors up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so not prime
            }
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of primes to find: ");
        int n = sc.nextInt();

        int count = 0; // Number of primes found
        int num = 2; // Start checking from 2

        System.out.println("First " + n + " prime numbers:");
        while (count < n) {
            if (prime(num)) { // Check if the number is prime
                System.out.print(num + " "); // Print the prime number
                count++; // Increment the prime count
            }
            num++; // Move to the next number
        }
        sc.close();
    }
}
