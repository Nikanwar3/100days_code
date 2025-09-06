// import java.util.*;

// public class Classroom{
//     static class Heap{
//         ArrayList<Integer> arr = new ArrayList<>();
//         public void add(int data){
//             int x = arr.size()-1;
//             int par = (x - 1) / 2;

//             while(arr.get(x) < arr.get(par)){       // O(log n)
//                 // Swap
//                 int temp = arr.get(x);              // O(log n)
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);
//             }
//         }

//     }
//     public static void main(String[]args){
        
//     }
// }

import java.util.*;

public class Classroom {
    static class MinHeap {
        private ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int childIdx = arr.size() - 1;
            int parentIdx = (childIdx - 1) / 2;
            while (childIdx > 0 && arr.get(childIdx) < arr.get(parentIdx)) {
                Collections.swap(arr, childIdx, parentIdx);
                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }

        public int peek() {
            if (arr.isEmpty()) throw new NoSuchElementException("Heap is empty");
            return arr.get(0);
        }

        public int remove() {
            if (arr.isEmpty()) throw new NoSuchElementException("Heap is empty");
            int root = arr.get(0);
            int last = arr.remove(arr.size() - 1);
            if (!arr.isEmpty()) {
                arr.set(0, last);
                heapifyDown(0);
            }
            return root;
        }

        private void heapifyDown(int idx) {
            int smallest = idx;
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            if (left < arr.size() && arr.get(left) < arr.get(smallest)) smallest = left;
            if (right < arr.size() && arr.get(right) < arr.get(smallest)) smallest = right;
            if (smallest != idx) {
                Collections.swap(arr, idx, smallest);
                heapifyDown(smallest);
            }
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        heap.add(5);
        heap.add(3);
        heap.add(10);
        heap.add(1);
        System.out.println("Peek: " + heap.peek());
        while (!heap.isEmpty()) {
            System.out.println(heap.remove());
        }
    }
}