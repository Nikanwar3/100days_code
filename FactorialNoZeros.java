// // import java.util.*;
// import java.math.BigInteger;
// import java.util.stream.Collectors;

// public class Factorial {
//     // Recursive factorial using BigInteger
//     private static BigInteger factorial(BigInteger n) {
//         if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
//             return BigInteger.ONE;
//         }
//         return n.multiply(factorial(n.subtract(BigInteger.ONE)));
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         BigInteger n = BigInteger.valueOf(num);

//         BigInteger fact = factorial(n);

//         // Convert to string and filter out zeros using streams
//         String noZeros = fact.toString()
//                 .chars()
//                 .filter(ch -> ch != '0')
//                 .mapToObj(ch -> String.valueOf((char) ch))
//                 .collect(Collectors.joining());

//         System.out.println(noZeros);
//     }
// }

import java.util.Scanner;
import java.math.BigInteger;
import java.util.stream.Collectors;

public class FactorialNoZeros {

   
    private static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; 
             i.compareTo(n) <= 0; 
             i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        BigInteger n = BigInteger.valueOf(num);

   
        BigInteger fact = factorial(n);

        
        String noZeros = fact.toString()
                .chars()
                .filter(ch -> ch != '0')
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());

        System.out.println("Factorial (without zeros): " + noZeros);
    }
}