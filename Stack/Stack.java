// // // import java.util.EmptyStackException;

// // class MinStack {
// //     private static final int CAPACITY = 1000;
// //     private int[] mainStack = new int[CAPACITY];
// //     private int[] minStack = new int[CAPACITY]; // keeps track of min
// //     private int top = -1;
// //     private int minTop = -1;

// //     public boolean isFull() {
// //         return top == CAPACITY - 1;
// //     }

// //     public boolean isEmpty() {
// //         return top == -1;
// //     }

// //     public void push(int x) {
// //         if (isFull()) {
// //             throw new RuntimeException("Stack Overflow");
// //         }
// //         mainStack[++top] = x;

// //         // push to minStack if minStack empty or x <= current min
// //         if (minTop == -1 || x <= minStack[minTop]) {
// //             minStack[++minTop] = x;
// //         }
// //     }

// //     public int pop() {
// //         if (isEmpty()) {
// //             throw new EmptyStackException();
// //         }
// //         int popped = mainStack[top--];

// //         // if popped equals the minStack top, pop it too
// //         if (popped == minStack[minTop]) {
// //             minTop--;
// //         }
// //         return popped;
// //     }

// //     public int peek() {
// //         if (isEmpty()) throw new EmptyStackException();
// //         return mainStack[top];
// //     }

// //     public int getMin() {
// //         if (minTop == -1) throw new EmptyStackException();
// //         return minStack[minTop];
// //     }

// //     public void display() {
// //         if (isEmpty()) {
// //             System.out.println("Stack is empty");
// //         } else {
// //             System.out.print("Stack (top to bottom): ");
// //             for (int i = top; i >= 0; i--) {
// //                 System.out.print(mainStack[i] + " ");
// //             }
// //             System.out.println();
// //         }
// //     }

// //     public static void main(String[] args) {
// //         MinStack s = new MinStack();
// //         s.push(10);
// //         s.push(20);
// //         s.push(5);
// //         s.push(30);
// //         s.display(); // 30 5 20 10
// //         System.out.println("Current min: " + s.getMin()); // 5
// //         s.pop(); // removes 30
// //         System.out.println("Top: " + s.peek()); // 5
// //         System.out.println("Current min: " + s.getMin()); // 5
// //         s.pop(); // removes 5
// //         System.out.println("Current min: " + s.getMin()); // 10
// //     }
// // }

// class MinStack {   //main class
//     private static final int CAPACITY = 1000;
//     private long[] stack = new long[CAPACITY];
//     private int top = -1;
//     private long min;

//     public boolean isFull() {
//         return top == CAPACITY - 1;
//     }

//     public boolean isEmpty() {
//         return top == -1;
//     }

//     public void push(int x) {
//         if (isFull()) throw new RuntimeException("Stack Overflow");

//         if (isEmpty()) {
//             min = x;
//             stack[++top] = x;
//         } else if (x < min) {
//             // store encoded value
//             stack[++top] = 2L * x - min;
//             min = x;
//         } else {
//             stack[++top] = x;
//         }
//     }

//     public int pop() {
//         if (isEmpty()) throw new java.util.EmptyStackException();
//         long val = stack[top--];

//         if (val < min) { // encoded value
//             long originalMin = min;
//             min = 2L * min - val;
//             return (int) originalMin;
//         } else {
//             return (int) val;
//         }
//     }

//     public int peek() {
//         if (isEmpty()) throw new java.util.EmptyStackException();
//         long val = stack[top];
//         if (val < min) return (int) min;
//         return (int) val;
//     }

//     public int getMin() {
//         if (isEmpty()) throw new java.util.EmptyStackException();
//         return (int) min;
//     }

//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty");
//             return;
//         }
//         System.out.print("Stack (top to bottom): ");
//         for (int i = top; i >= 0; i--) {
//             long val = stack[i];
//             if (val < min) System.out.print(min + " ");
//             else System.out.print(val + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         MinStack s = new MinStack();
//         s.push(10);
//         s.push(20);
//         s.push(5);
//         s.push(30);
//         s.display(); // 30 5 20 10
//         System.out.println("Current min: " + s.getMin()); // 5
//         s.pop(); // removes 30
//         System.out.println("Top: " + s.peek()); // 5
//         System.out.println("Current min: " + s.getMin()); // 5
//         s.pop(); // removes 5
//         System.out.println("Current min: " + s.getMin()); // 10
//     }
// }

class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) throw new EmptyStackException();
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) throw new EmptyStackException();
        return minStack.peek();
    }
}
