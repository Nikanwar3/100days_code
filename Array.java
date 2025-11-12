// // import java.util.*;
// // public class Array{
// //     public static int getLargest(int numbers[]){
// //         int largest = Integer.MIN_VALUE;

// //         for(int i =0; i<numbers.length;i++){
// //             if(largest <numbers[i]) {
// //                 largest = numbers[i];
// //             }
// //         }
// //         return largest;
// //     }
// //     public static void  main(String[]args){
// //         int array[] = {1,2,6,3,5};
// //         System.out.println("largest valur is :" + getLargest(array));//array);

// //     }
// // }



// public class Array {
//     public static int[] nextGreaterToRight(int[] numbers) {
//         int n = numbers.length;
//         int[] result = new int[n];
//         int maxFromRight = -1;

//         // traverse from right to left
//         for (int i = n - 1; i >= 0; i--) {
//             result[i] = maxFromRight;
//             if (numbers[i] > maxFromRight) {
//                 maxFromRight = numbers[i];
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int array[] = {4, 7, 3, 2, 5};
//         int[] res = nextGreaterToRight(array);
//         for (int x : res) {
//             System.out.print(x + " ");
//         }
//     }
// }

import java.util.*;

public class Array{
    public static void main(String[] args){//
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];//
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();// input 
        marks[2] = sc.nextInt();

        System.out.println("physics" + marks[0]); //print 

     }
}