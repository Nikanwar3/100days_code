class Stack {
    static int capacity = 1000;
    static int a[] = new int[capacity];
    static int top = -1;  // Fixed: changed 'temp' to 'top'
    
    // Check if stack is full
    static boolean isfull() {
        return top == capacity - 1;  // Now 'top' is defined
    }

    // Check if stack is empty
    static boolean isEmpty() {
        return top == -1;  // Fixed: correct syntax
    }
    
    // Push element to stack
    static void push(int ele) {
        if (isfull()) {
            System.out.println("Stack overflow");
        } else {  // Added else block to actually push the element
            top++;
            a[top] = ele;
            System.out.println("Pushed: " + ele);
        }
    }
    
    // Pop element from stack (your version - corrected)
    static void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("Popped: " + a[top]);  // Show what's being popped
            top--;
        }
    }
    
    // Peek top element without removing it (your version - corrected)
    static void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + a[top]);
        }
    }
    
    // Display all elements in stack
    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    
    // Get current size of stack
    static int size() {
        return top + 1;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== Your Stack Operations Sequence ===");
        
        // Your sequence:
        push(10);   // Stack: [10], top = 0
        push(20);   // Stack: [10, 20], top = 1  
        push(30);   // Stack: [10, 20, 30], top = 2
        pop();      // Remove 30, Stack: [10, 20], top = 1
        peek();     // Show top element (20)
        push(40);   // Stack: [10, 20, 40], top = 2
        display();  // Show final stack
        
        System.out.println("\n=== Step by Step Explanation ===");
        System.out.println("1. push(10) → Stack becomes [10]");
        System.out.println("2. push(20) → Stack becomes [10, 20]");
        System.out.println("3. push(30) → Stack becomes [10, 20, 30]");
        System.out.println("4. pop() → Removes 30, Stack becomes [10, 20]");
        System.out.println("5. peek() → Shows 20 (top element)");
        System.out.println("6. push(40) → Stack becomes [10, 20, 40]");
        System.out.println("7. display() → Shows final stack: 40 20 10");
    }
}
