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
import java.util.*;

class Solution {
    static class Pair {
        int i, j, sum;
        Pair(int i, int j, int sum) {//pair constructor
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
    }

    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (arr1.length == 0 || arr2.length == 0 || k == 0) return result;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.sum - b.sum);
        Set<String> visited = new HashSet<>();

        // Push the smallest pair (0, 0)
        pq.offer(new Pair(0, 0, arr1[0] + arr2[0]));
        visited.add("0,0");

        while (!pq.isEmpty() && result.size() < k) {
            Pair curr = pq.poll();

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr1[curr.i]);
            temp.add(arr2[curr.j]);
            result.add(temp);

            // Next pair in arr1 direction
            if (curr.i + 1 < arr1.length && !visited.contains((curr.i + 1) + "," + curr.j)) {
                pq.offer(new Pair(curr.i + 1, curr.j, arr1[curr.i + 1] + arr2[curr.j]));
                visited.add((curr.i + 1) + "," + curr.j);
            }

            // Next pair in arr2 direction
            if (curr.j + 1 < arr2.length && !visited.contains(curr.i + "," + (curr.j + 1))) {
                pq.offer(new Pair(curr.i, curr.j + 1, arr1[curr.i] + arr2[curr.j + 1]));
                visited.add(curr.i + "," + (curr.j + 1));
            }
        }

        return result;
    }
}
