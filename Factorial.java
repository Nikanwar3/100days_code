// import java.util.*;
import java.math.BigInteger;
import java.util.stream.Collectors;

public class Factorial {
    // Recursive factorial using BigInteger
    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        BigInteger n = BigInteger.valueOf(num);

        BigInteger fact = factorial(n);

        // Convert to string and filter out zeros using streams
        String noZeros = fact.toString()
                .chars()
                .filter(ch -> ch != '0')
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());

        System.out.println(noZeros);
    }
}
