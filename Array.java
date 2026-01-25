// // // // // // // import java.util.*;
// // // // // // // public class Array{
// // // // // // //     public static int getLargest(int numbers[]){
// // // // // // //         int largest = Integer.MIN_VALUE;

// // // // // // //         for(int i =0; i<numbers.length;i++){
// // // // // // //             if(largest <numbers[i]) {
// // // // // // //                 largest = numbers[i];
// // // // // // //             }
// // // // // // //         }
// // // // // // //         return largest;
// // // // // // //     }
// // // // // // //     public static void  main(String[]args){
// // // // // // //         int array[] = {1,2,6,3,5};
// // // // // // //         System.out.println("largest valur is :" + getLargest(array));//array);

// // // // // // //     }
// // // // // // // }



// // // // // // public class Array {
// // // // // //     public static int[] nextGreaterToRight(int[] numbers) {
// // // // // //         int n = numbers.length;
// // // // // //         int[] result = new int[n];
// // // // // //         int maxFromRight = -1;

// // // // // //         // traverse from right to left
// // // // // //         for (int i = n - 1; i >= 0; i--) {
// // // // // //             result[i] = maxFromRight;
// // // // // //             if (numbers[i] > maxFromRight) {
// // // // // //                 maxFromRight = numbers[i];
// // // // // //             }
// // // // // //         }
// // // // // //         return result;
// // // // // //     }

// // // // // //     public static void main(String[] args) {
// // // // // //         int array[] = {4, 7, 3, 2, 5};
// // // // // //         int[] res = nextGreaterToRight(array);
// // // // // //         for (int x : res) {
// // // // // //             System.out.print(x + " ");
// // // // // //         }
// // // // // //     }
// // // // // // }

// // // // // import java.util.*;

// // // // // public class Array{
// // // // //     public static void main(String[] args){//
// // // // //         Scanner sc = new Scanner(System.in);//
// // // // //         int marks[] = new int[50];//
// // // // //         marks[0] = sc.nextInt();//
// // // // //         marks[1] = sc.nextInt();// input 
// // // // //         marks[2] = sc.nextInt();

// // // // //         System.out.println("physics" + marks[0]); //print 

// // // // //      }
// // // // // }

// // // // class Solution {
// // // //     public void sort012(int[] arr) {
// // // //         int low = 0;
// // // //         int mid = 0;
// // // //         int high = arr.length - 1;

// // // //         while (mid <= high) {
// // // //             if (arr[mid] == 0) {
// // // //                 // swap arr[low] & arr[mid]
// // // //                 int temp = arr[low];
// // // //                 arr[low] = arr[mid];
// // // //                 arr[mid] = temp;
// // // //                 low++;
// // // //                 mid++;
// // // //             } 
// // // //             else if (arr[mid] == 1) {
// // // //                 mid++;
// // // //             } 
// // // //             else { // arr[mid] == 2
// // // //                 // swap arr[mid] & arr[high]
// // // //                 int temp = arr[mid];
// // // //                 arr[mid] = arr[high];
// // // //                 arr[high] = temp;
// // // //                 high--;
// // // //             }
// // // //         }
// // // //     }
// // // // }

// // // class Solution {
// // //     public void sort012(int[] arr) {
// // //         int low = 0;
// // //         int mid = 0;
// // //         int high = arr.length - 1;

// // //         while (mid <= high) {
// // //             if (arr[mid] == 0) {
// // //                 // swap arr[low] & arr[mid]
// // //                 int temp = arr[low];
// // //                 arr[low] = arr[mid];
// // //                 arr[mid] = temp;
// // //                 low++;
// // //                 mid++;
// // //             } 
// // //             else if (arr[mid] == 1) {
// // //                 mid++;
// // //             } 
// // //             else { // arr[mid] == 2
// // //                 // swap arr[mid] & arr[high]
// // //                 int temp = arr[mid];
// // //                 arr[mid] = arr[high];
// // //                 arr[high] = temp;
// // //                 high--;
// // //             }
// // //         }
// // //     }
// // // }

// // class Solution {
// //     public int maxSubarraySum(int[] arr, int k) {
// //         int n = arr.length;

// //         // sum of first k elements
// //         int windowSum = 0;
// //         for (int i = 0; i < k; i++) {
// //             windowSum += arr[i];
// //         }

// //         int maxSum = windowSum;

// //         // slide the window
// //         for (int i = k; i < n; i++) {
// //             windowSum += arr[i] - arr[i - k]; // add new, remove old
// //             maxSum = Math.max(maxSum, windowSum);
// //         }

// //         return maxSum;
// //     }
// // }

// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         while (t-- > 0) {//
//             int n = sc.nextInt();
//             int zeros = 0;

//             for (int i = 0; i < n; i++) {
//                 if (sc.nextInt() == 0) zeros++;
//             }

//             if (zeros % 2 == 1)//
//                 System.out.println("Alice");
//             else
//                 System.out.println("Bob");
//         }
//     }
// }

import java.util.Scanner; 

class Codechef
{
	public static void main (String[] args)
	{
	    // Do not print anything here before taking input
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// Print the value of n
		System.out.println(n);
	}
}