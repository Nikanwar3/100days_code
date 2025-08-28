// import java.util.*;
// public class Array {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;

//         for(int i =0; i<numbers.length;i++) {
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;


//     }
//     public static void main(String args[]) {
//         int numbers[] = {1,2,7,3,5};
//         System.out.println("Largest number is: " + getLargest(numbers)); //call
//     }
// }

// to update array basic one

// public class Array{
//     public static void Update(int marks[]){
//         for(int i = 0; i < marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
    
//     public static void main(String[] args){
//         int marks[] = {97, 98, 99};
        
//         // Print original array
//         System.out.println("Original marks:");
//         for(int i = 0; i < marks.length; i++){
//             System.out.println("marks[" + i + "] = " + marks[i]);
//         }
        
//         // Update the array
//         Update(marks);                  // in
        
//         // Print updated array
//         System.out.println("\nUpdated marks:");
//         for(int i = 0; i < marks.length; i++){
//             System.out.println("marks[" + i + "] = " + marks[i]);
//         }
//     }
// }


import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 7};
        System.out.println("Triangles = " + countTriangles(arr));
    }

    public static int countTriangles(int arr[]) {
        int n = arr.length;
        int count = 0;

        Arrays.sort(arr);  

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}