// // // import java.util.*;
// // // public class Array {
// // //     public static int getLargest(int numbers[]) {
// // //         int largest = Integer.MIN_VALUE;

// // //         for(int i =0; i<numbers.length;i++) {
// // //             if(largest < numbers[i]) {
// // //                 largest = numbers[i];
// // //             }
// // //         }
// //         return largest; return largest value


// // //     }
// // //     public static void main(String args[]) {
// // //         int numbers[] = {1,2,7,3,5};
// // //         System.out.println("Largest number is: " + getLargest(numbers)); //call largest
// // //     }
// // // }

// // // to update array basic one

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
// // // public class Array{
// // //     public static void Update(int marks[]){
// // //         for(int i = 0; i < marks.length; i++){
// // //             marks[i] = marks[i] + 1;
// // //         }
// // //     }
    
// // //     public static void main(String[] args){
// // //         int marks[] = {97, 98, 99};
        
// // //         // Print original array
// // //         System.out.println("Original marks:");
// // //         for(int i = 0; i < marks.length; i++){
// // //             System.out.println("marks[" + i + "] = " + marks[i]);
// // //         }
        
// // //         // Update the array
// // //         Update(marks);                  // in line funct
        
// // //         // Print updated array
// // //         System.out.println("\nUpdated marks:");
// // //         for(int i = 0; i < marks.length; i++){
// // //             System.out.println("marks[" + i + "] = " + marks[i]);
// // //         }
// // //     }
// // // }

// // // import java.util.Arrays;    import

// // // class Array {
// // //     public static void main(String[] args) {
// // //         // Example array
// // //         int arr[] = {4, 6, 3, 7};

// // //         // Print total number of triangles possible
// // //         System.out.println("Triangles = " + countTriangles(arr));
// // //     }

// // //     // Function to count number of valid triangles
// // //     // A triangle is valid if sum of any two sides > third side
// // //     public static int countTriangles(int arr[]) {
// // //         int n = arr.length;
// // //         int count = 0;

// // //         // Step 1: Sort the array
// // //         Arrays.sort(arr);  

// // //         // Step 2: Fix the largest element one by one
// // //         for (int k = n - 1; k >= 2; k--) {
// // //             int i = 0, j = k - 1;

// // //             // Step 3: Use two pointers to find valid pairs
// // //             while (i < j) {
// // //                 if (arr[i] + arr[j] > arr[k]) {
// // //                     // If arr[i] + arr[j] > arr[k],
// // //                     // then all elements from i..j-1 with arr[j] are valid
// // //                     count += (j - i);
// // //                     j--;
// // //                 } else {
// // //                     i++;
// // //                 }
// // //             }
// // //         }
// // //         return count;
// // //     }
// // // }


// // class Array{
// //    public static void main(String args[]){
// //     int arr[] = {1,2,3,4,5};
// //     System.out.println(arr.length);
// //    } 

// // }

// // public class Array{
// //    public static void main(String[]args){
// //          int marks[] = new int [3];
// //          int numbers[] = {1,2,3};
// //          String fruits[] =  {"apple", "mango", "banana"};
// //       }
// //    }
// public class Array{

//    public static int getLargest(int nums[]){
//       int largest = Integer.MIN_VALUE;// for largest value
      
//       for(int i = 0; i<nums.length;i++){
//          if(largest<nums[i]){
//             largest=nums[i];
//          }
//       }
//       return largest;.............................................................................................
.,..


//    }
//    public static void main(String[]args){
//       int nums[]= {1,2,4,6,8}; 
//       System.out.println("Largest number is: " + getLargest(nums));// print largest number is getLargest number is largest array
print largest and func



//    }...........
// }..
public class Main {

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = binarySearch(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
