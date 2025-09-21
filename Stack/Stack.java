// import java.util.EmptyStackException;

class MinStack {
    private static final int CAPACITY = 1000;
    private int[] mainStack = new int[CAPACITY];
    private int[] minStack = new int[CAPACITY]; // keeps track of min
    private int top = -1;
    private int minTop = -1;

    public boolean isFull() {
        return top == CAPACITY - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        mainStack[++top] = x;

        // push to minStack if minStack empty or x <= current min
        if (minTop == -1 || x <= minStack[minTop]) {
            minStack[++minTop] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int popped = mainStack[top--];

        // if popped equals the minStack top, pop it too
        if (popped == minStack[minTop]) {
            minTop--;
        }
        return popped;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return mainStack[top];
    }

    public int getMin() {
        if (minTop == -1) throw new EmptyStackException();
        return minStack[minTop];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(mainStack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(10);
        s.push(20);
        s.push(5);
        s.push(30);
        s.display(); // 30 5 20 10
        System.out.println("Current min: " + s.getMin()); // 5
        s.pop(); // removes 30
        System.out.println("Top: " + s.peek()); // 5
        System.out.println("Current min: " + s.getMin()); // 5
        s.pop(); // removes 5
        System.out.println("Current min: " + s.getMin()); // 10
    }
}