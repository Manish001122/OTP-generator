import java.util.Random;
import java.util.Scanner;

public class otp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for OTP length
        System.out.print("Enter OTP length 10: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Generate OTP using SecureRandom
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            otp.append(random.nextInt(10));
        }

        // Print OTP to console
        System.out.println("Your OTP is: " + otp.toString());

        scanner.close();
    }
}
