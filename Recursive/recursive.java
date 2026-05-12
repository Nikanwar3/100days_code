// package Recursive;

// public class recursive {//
//     public static void recursiveFunction(int n) {
//         if (n <= 0) {
//             System.out.println("Base case reached");//
//             return;//
//         }
//         System.out.println("Current value: " + n);//
//         recursiveFunction(n - 1);//

//     }
//     public  static void main(String[] args) {//
        
//     }

    
// }



static int binarySearch(int[] arr, int low, int high, int target) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] > target) return binarySearch(arr, low, mid - 1, target);
    return binarySearch(arr, mid + 1, high, target);
}
