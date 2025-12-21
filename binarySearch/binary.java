// // public class binarySearch {
// //     public static int binarySearch(int numbers[], int key) {
// //         int start = 0, end = numbers.length - 1;

// //         while (start <= end) {
// //             int mid = (start + end) / 2;
            
// //             if (numbers[mid] == key) {
// //                 return mid;
// //             } else if (numbers[mid] < key) {
// //                 start = mid + 1; // Search right half
// //             } else {
// //                 end = mid - 1;   // Search left half
// //             }
// //         }
        
// //         return -1; // Key not found
// //     }

// //     public static void main(String[] args) {
// //         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
// //         int key = 10;

// //         int result = binarySearch(numbers, key);
// //         if (result != -1) {
// //             System.out.println("Element found at index: " + result);
// //         } else {
// //             System.out.println("Element not found"); // Output if key is not found
// //         }
// //     }
// // }

// public class binarySearch{
//     public  static int binary(int numbers[],int key){
//         int start = 0, end = numbers.length -1 ;
//         while(start<=end){
//             int mid = (start + end)/2;
//             if(numbers[mid]== key){
//                 return mid;
//             }
//             else if (numbers[mid] < key){//right
//                 start = mid + 1;
//             }
//             else{
//                 end = mid - 1;
//             }

//             }
//             return -1;

//             }
        
//         public static void main(String[]args){
//             int numbers[] = {2,4,6,8,10};
//             int key = 6;
//         }
//         System.out.println(binary(numbers,key));
// }
// }
    

    
import java.util.*;
public class binary{
	public static int binarySearch(int numbers[],int key){
		int start =0, end = numbers.length-1;
		while(start<=end){
		int mid = (start + end)/2;
		if(numbers[mid] == key){
			return mid;
		}
		if(numbers[mid]<key){
			start = mid + 1;}
else{
	end = mid -1;//
}
}
return -1;//
	}
		


	public static void main(String[]args){
		int numbers[] = {2,4,6,8,10};
		int key = 10;
		System.out.println("key at :" + binarySearch(numbers,key));
	}
}