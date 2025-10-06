// // public class main{
// //     public  static void main(String[]args){
// //         System.out.println("*\n");
// //         System.out.println("Hello World\n");
// //         System.out.println("*\n");
// //         System.out.println("Hello World!");
// //     }
// // }

// import java.util.*;

// class MedianFinder {
//     private PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
//     private PriorityQueue<Integer> right = new PriorityQueue<>();

//     public void addNum(int num) {
//         if (left.isEmpty() || num <= left.peek()) left.offer(num);
//         else right.offer(num);

//         if (left.size() > right.size() + 1) right.offer(left.poll());
//         if (right.size() > left.size()) left.offer(right.poll());
//     }

//     public double findMedian() {
//         if (left.size() == right.size())
//             return (left.peek() + right.peek()) / 2.0;
//         else
//             return left.peek();
//     }
// }

