// // // class Basic {

// // //     public static int trappedWater(int height[]) {

// // //         int n = height.length;

// // //         // Step 1: Create left max array
// // //         int leftMax[] = new int[n];
// // //         leftMax[0] = height[0];
// // //         for (int i = 1; i < n; i++) {
// // //             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
// // //         }

// // //         // Step 2: Create right max array
// // //         int rightMax[] = new int[n];
// // //         rightMax[n - 1] = height[n - 1];
// // //         for (int i = n - 2; i >= 0; i--) {
// // //             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
// // //         }

// // //         // Step 3: Calculate trapped water
// // //         int trappedWater = 0;
// // //         for (int i = 0; i < n; i++) {
// // //             int waterLevel = Math.min(leftMax[i], rightMax[i]);
// // //             trappedWater += waterLevel - height[i];
// // //         }

// // //         return trappedWater;
// // //     }

// // //     public static void main(String[] args) {
// // //         int height[] = {4, 2, 0, 6, 3, 2, 5};
// // //         System.out.println("Trapped water is: " + trappedWater(height));
// // //     }
// // // }

// // public class Basic{
// //     public static int buySell(int prices[]){
// //         int buyPrice = Integer.MAX_VALUE;
// //         int maxProfit = 0;
// //         for(int i =0;i<prices.length;i++){
// //             if(buyPrice < prices[i]){
// //                int profit  = prices[i] -    buyPrice;
// //                maxProfit = Math.max(profit, maxProfit);


// //             }else{
// //                 buyPrice = prices[i];
// //             }
// //         }

// //     }
// //     public static void main(String[]args){
// //         int prices[] = {7,1,5,3,6,4};
// //         System.out.println("Max profit is : " + buySell(prices));
// //     }
// // }

// public class Basics{
//     public boolean isRepeating(int number[]){
//         for(int i =0; i<numbers.length;i++){
//             for(int j = i+1; j<numbers.length;j++){
//                 if(numbers[i] == numbers[j]){
//                     return true;
//                 }
//             }

//         }
//         return false;

//     }
// }

public class Basics{
    public static void bubbleSort(int numbers[]){
        for(int turn =0; turn<numbers.length-1;turn++){
            for(int j =0; j<numbers.length-1-turn;j++){
                if (numbers[j] > numbers[j+1){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;//
                    

                }
            }
        }
    }

    public static void main(String[]args){

    }
}