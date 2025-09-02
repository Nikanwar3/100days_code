// // // we have to print 1  to n . n will deide by taking input from user
// // import java.util.*;
// // public class statement{
// //     public static void main(String[]args){
// //         int counter = 1;
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         while(counter<=n){
// //             System.out.println(counter + " ");
// //             counter++;
// //         }
// //         System.out.println();
// //     }
// // }
// import java.util.*;
// import java.util.Scanner;

// public class statement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();   
//         int i = 1;
//         int sum = 0;

//         while (i <= n) {
//             System.out.println(sum);  
//             sum = sum + i;            
//             i++;                     
//         }
//         System.out.println(); // 
//     }
// }

import java.util.*;

public class statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 2; // start from first prime
        int primeSum = 0; 
        int count = 0; // number of primes found

        while (i <= n) {
            boolean isPrime = true;
            int j = 2;

            // check if i is prime
            while (j * j <= i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                primeSum += i;
                count++;
                System.out.println("Prime " + count + " = " + i + " | Cumulative Sum = " + primeSum);
            }

            i++;
        }

        System.out.println("Total Primes up to " + n + " = " + count);
        System.out.println("Final Sum of Primes = " + primeSum);
    }
}