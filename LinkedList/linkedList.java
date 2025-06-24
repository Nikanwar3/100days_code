class Node {
    int data;
    Node next;
    
    Node(int val) {
        data = val;
        next = null;
    }
}

class linkedList {
    static Node head;
    
    // Insert at the beginning
    static void insertbegin(int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
    
    // Insert at the end
    static void insertend(int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    
    // Display the list
    static void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // New line after printing all elements
        }
    }
    
    public static void main(String[] args) {
        insertbegin(1);
        insertbegin(3);
        insertend(11);
        display();
    }
}