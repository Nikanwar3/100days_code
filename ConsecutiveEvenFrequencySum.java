// import java.util.Scanner;

// public class ConsecutiveEvenFrequencySum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str = scanner.nextLine();

//         int sum = 0;
//         int count = 1;
//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == str.charAt(i - 1)) {
//                 count++;
//             } else {
//                 if (count % 2 == 0) {
//                     sum += count;
//                 }
//                 count = 1;
//             }
//         }
        
//         if (count % 2 == 0) {
//             sum += count;
//         }

//         System.out.println(sum);
//     }
// }
import java.util.*;

public class ConsecutiveEvenFrequencySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        while (t-- > 0) {
            String str = scanner.nextLine();
            System.out.println(getEvenFreqSum(str));
        }
    }

    private static int getEvenFreqSum(String str) {
        int sum = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count % 2 == 0) sum += count;
                count = 1;
            }
        }
        if (count % 2 == 0) sum += count;
        return sum;
    }
}