import java.util.HashMap;

public class TwoSum {

    // Returns indices of two numbers that add up to target
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);// Store the index of the current number
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;// Example input

        int[] result = twoSum(nums, target);// Should return [0, 1] since nums[0] + nums[1] = 2 + 7 = 9// Example output
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found.");// This should not happen for valid input as per problem statement// but it's good to handle the case where no solution exists.
        }
    }
}



// int left = 0, right = nums.length - 1;
// while (left < right) {
//     int sum = nums[left] + nums[right];
//     if (sum == target) return new int[]{left, right};
//     else if (sum < target) left++;
//     else right--;
// }

static int binarySearch(int[] arr, int low, int high, int target) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] > target) return binarySearch(arr, low, mid - 1, target);
    return binarySearch(arr, mid + 1, high, target);
}


// // Structure of every recursive function:
// returnType method(params) {
//     if (base case) return something;   // STOP
//     return method(smaller input);      // RECURSE
// }


// static int factorial(int n) {
//     if (n == 0) return 1;           // base case
//     return n * factorial(n - 1);    // recursive call
// }
