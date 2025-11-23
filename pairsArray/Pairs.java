
// // public class Pairs {

// //     public static void printPairs(int numbers[]) {
// //         int tp =0;
// //         for( int i =0;i<numbers.length;i++) {
// //             int curr = numbers[i];
// //             for(int j = i+1; j<numbers.length;j++) {
// //                 System.out.print("("+curr+","+numbers[j]+") ");
// //             }        
// //         System.out.println();
// //         }
// //     }
// //     public static void main(String[]args) {
// //         int numbers[] = {2,4,6,8,10};
// //         printPairs(numbers);
// //     }

// // }
// // // public class Pairs{

// // //     public static void  printPairs(int numbers[]) {
// // //         for(int i =0;i<numbers.length;i++) {
// // //            int curr = numbers[i];
// // //             for(int j = i+1;j<numbers.length;j++) {
// // //                 System.out.println("("+curr+","+ numbers[j]+ ") ");

// // //             }
// // //             System.out.println();

// // //         }
// // //     }


// // //     public static void main(String[]args) {
// // //         int numbers[] = {2,4,6,8,10};
// // //         printPairs(numbers);
// // //     }
// // // }

// import java.util.*;
// import java.util.stream.*;

// public class Pairs {

//     // Generic method for any type of array
//     public static <T> void printPairs(T[] arr) {
//         IntStream.range(0, arr.length)
//                  .forEach(i -> IntStream.range(i + 1, arr.length)
//                                          .forEach(j -> System.out.println("(" + arr[i] + "," + arr[j] + ")")));
//     }

//     public static void main(String[] args) {
//         Integer[] numbers = {2, 4, 6, 8, 10};
//         printPairs(numbers);

//         // You can also test with Strings
//         String[] letters = {"A", "B", "C"};
//         printPairs(letters);
//     }
// }
public class Pairs{
	public static void printPairs(int number[]){
		for(int i =0;i<number.length;i++){
			int curr = number[i];
		for(int j = i+1;j<number.length;j++){
			System.out.print("("+ curr + "," + number[j] + ")");
}
			System.out.println();
}
}
public static void main(String[]args){
int number[] = {2,3,4,5,6,7};
printPairs(number);//
}
}