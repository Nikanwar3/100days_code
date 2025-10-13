// // 


// public class Basic{
//     public static void subArray(int numbers[]){
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i =0; i<numbers.length;i++){
//             int start = i;
//             for (int j =i; j<numbers.length;j++){
//                 int end = j;
//                 currSum = 0;
//                 for(int k = start; k<=end;k++){
//                     currSum += numbers[k];

//                 }
//                 if (maxSum< currSum){
//                     maxSum= currSum;
//                 }
//                 }
//             }
//         }
//         System.out.println("Maximum SubArray Sum is: " + maxSum);
//     }
// }

public class Basic {
    public static void subArray(int numbers[]) {
        int n = numbers.length;
        int maxSum = Integer.MIN_VALUE;

        // Step 1: create prefix sum array
        int prefix[] = new int[n];
        prefix[0] = numbers[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Step 2: calculate subarray sums using prefix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum SubArray Sum is: " + maxSum);
    }

    public static void main(String[] args) {//
        int numbers[] = {1, -2, 6, -1, 3};
        subArray(numbers);
    }
}