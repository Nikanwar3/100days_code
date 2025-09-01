// // we have to print 1  to n . n will deide by taking input from user
// import java.util.*;
// public class statement{
//     public static void main(String[]args){
//         int counter = 1;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(counter<=n){
//             System.out.println(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }
import java.util.*;
import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int i = 1;
        int sum = 0;

        while (i <= n) {
            System.out.println(sum);  
            sum = sum + i;            
            i++;                     
        }
        System.out.println();
    }
}