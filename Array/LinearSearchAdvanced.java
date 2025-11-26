// // public class linearSearch{
// //     public static int linear(int numbers[],int key){
// //         for(int i =0;i<numbers.length;i++){
// //             if(numbers[i]==key){
// //                 return i;
// //             }
// //         }
// //         return-1;
        
// //     }

// //     public static void main(String[]args){
// //         int numbers[] = {5, 3, 8, 4, 2};
// //         int key = 8;
// //         int index = linear( numbers, key);
// //         if(index == -1) {
// //             System.out.println("not found"); // if the key is not found
// //         }
// //         System.out.println();

// //     }
// // }



// import java.util.*;

// public class LinearSearchAdvanced {

//     // Recursive Linear Search with count
//     public static int linearRecursive(int arr[], int n, int key, int index, int comparisons[]) {
//         if (index == n) return -1; // base case: end of array
//         comparisons[0]++; // track comparisons
//         if (arr[index] == key) return index;
//         return linearRecursive(arr, n, key, index + 1, comparisons);
//     }

//     // Find all occurrences
//     public static List<Integer> findAllOccurrences(int arr[], int key) {
//         List<Integer> result = new ArrayList<>();//find array
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 result.add(i);
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {5, 3, 8, 4, 2, 8, 8};
//         int key = 8;

//         // Recursive Search with comparison count
//         int comparisons[] = {0};
//         int index = linearRecursive(numbers, numbers.length, key, 0, comparisons);

//         if (index == -1) {
//             System.out.println("Key " + key + " not found!");
//         } else {
//             System.out.println("First occurrence of key " + key + " is at index: " + index);
//             System.out.println("Comparisons made: " + comparisons[0]);
//         }

//         // All occurrences
//         List<Integer> allIndices = findAllOccurrences(numbers, key);
//         System.out.println("All occurrences of " + key + " are at indices: " + allIndices);
//     }
// }



//LinearSearch
import java.util.*;
class LinearSearchAdvanced{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[]args){
        int numbers[] = {2,4,6,8,10,12,14,18};
    
    
      
            System.out.println("largest at" + getLargest(numbers));
        

    }
}