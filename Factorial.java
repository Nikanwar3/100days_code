import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        
        String factStr = Long.toString(factorial);
        for (char c : factStr.toCharArray()) {
            if (c != '0') {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
