// // //  class reverse {
// // //     public static void reverse(int numbers[]) {
// // //         int first = 0, last = numbers.length - 1; //first declare first and end point 
        
// // //         while (first < last) {
// // //             int temp = numbers[first];
// // //             numbers[first] = numbers[last];
// // //             numbers[last] = temp;
// // //             first++;    
// // //             last--;
// // //         }
// // //     }
    
// // //     public static void main(String[] args) {
// // //         int numbers[] = {2, 4, 6, 8, 10};
// // //         System.out.println("Original array:");
// // //         for (int i = 0; i < numbers.length; i++) {
// // //             System.out.print(numbers[i] + " ");
// // //         }
// // //         System.out.println();
        
// // //         reverse(numbers);
        
// // //         System.out.println("Reversed array:");
// // //         for (int i = 0; i < numbers.length; i++) {
// // //             System.out.print(numbers[i] + " ");
// // //         }
// // //         System.out.println();
// // //     }
// // // }

// // // // public class reverse{
// // // //     public static int reverse(numbers[]){
// // // //         int first = 0, last = numbers.length -1 ;
// // // //         while(first<last){
// // // //             int  temp = int numbers[first];
// // // //             int numbers[first] = int numbers[last];
// // // //             int numbers[last] = temp;
// // // //             first++;
// // // //             last--;
// // // //         }

// // // //     }
// // // //     public static void main(String[]args){
// // // //         int numbers[] = {2,4,6,8,10};
// // // //         reverse(numbers)
// // // //         for(int i = 0; i<numbers.length;i++){
// // // //             System.out.println(reverse + " ");
// // // //         }
// // // // System.out.println();
// // // //     }
// // // // }

// // public class reverse{

// //     public static void reverse(int numbers[]){
// //         int first = 0, last = numbers.length-1;
// //         while(first<last){
// //             int temp = numbers[first];
// //             numbers[first] = numbers[last];
// //             numbers[last ] = temp;
// //             first++;
// //             last--;
// //         }

// //     }
// //     public static void main(String[]args){
// //         int numbers[] = {2,4,6,8,10};
// //         reverse(numbers);
// //         for(int i = 0; i < numbers.length;i++){
// //             System.out.println(numbers[i]+" ");
// //         }
// //         System.out.println();

// //     }
// // }

// public class reverse{
//     public static void subArrays(int numbers[]){
//         for(int i =0; i <numbers.length;i++){
//             int start = i;
//             for(int j = i; j <numbers.length;j++){
//                 int end = j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(numbers[k]+ " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String[]args){ //printing all subarrays
//         int numbers[] = {2,3,4,5,6,7,8};
//         subArrays(numbers);
//     }
// }

import java.util.*;

public class reverse {
    public static void reverse(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);//
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();//
    }
}