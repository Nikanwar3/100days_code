// // // class Node {
// // //     int data;
// // //     Node next;
    
// // //     Node(int val) {
// // //         data = val;
// // //         next = null;
// // //     }
// // // }

// // // class linkedList {
// // //     static Node head;
    
// // //     // Insert at the beginning
// // //     static void insertbegin(int ele) {
// // //         Node newnode = new Node(ele);
// // //         if (head == null) {
// // //             head = newnode;
// // //         } else {
// // //             newnode.next = head;
// // //             head = newnode;
// // //         }
// // //     }
    
// // //     // Insert at the end
// // //     static void insertend(int ele) {
// // //         Node newnode = new Node(ele);
// // //         if (head == null) {
// // //             head = newnode;
// // //             return;
// // //         }
        
// // //         Node temp = head;
// // //         while (temp.next != null) {
// // //             temp = temp.next;
// // //         }
// // //         temp.next = newnode;
// // //     }
    
// // //     // Display the list
// // //     static void display() {
// // //         if (head == null) {
// // //             System.out.println("Linked list is empty");
// // //         } else {
// // //             Node temp = head;
// // //             while (temp != null) {
// // //                 System.out.print(temp.data + " ");
// // //                 temp = temp.next;
// // //             }
// // //             System.out.println(); // New line after printing all elements
// // //         }
// // //     }
    
// // //     public static void main(String[] args) {
// // //         insertbegin(1);
// // //         insertbegin(3);
// // //         insertend(11);
// // //         display();
// // //     }
// // // }

// // public class linkedList{
// //     public static class Node{
// //         int data;
// //         Node next;

// //         public Node(int data){
// //             this.data = data;
// //             this.next = null;

// //             public void addFirst(int data) {// Insert at the beginning
// //                 Node newNode = new Node(data);
// //                 if (head == null) {
// //                     head = newNode;
// //                 } else {
// //                     newNode.next = head;
// //                     head = newNode;
// //                 }
                
// //             }
// //         }
// //     }
// //     public static void main(String[]args){
// //         linkedList ll = new linkedList();//linkedList object

// //     }
// // }
// /*
// class Node {
//     int data;
//     Node next;

//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }
// */

// class Solution {
    
//     private Node reverse(Node head) {
//         Node prev = null, curr = head;
//         while (curr != null) {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
    
//     public Node addTwoLists(Node head1, Node head2) {
//         // Reverse both lists
//         head1 = reverse(head1);
//         head2 = reverse(head2);
        
//         Node dummy = new Node(0);
//         Node tail = dummy;
//         int carry = 0;
        
//         // Add digits
//         while (head1 != null || head2 != null || carry != 0) {
//             int sum = carry;
//             if (head1 != null) {
//                 sum += head1.data;
//                 head1 = head1.next;
//             }
//             if (head2 != null) {
//                 sum += head2.data;
//                 head2 = head2.next;
//             }
            
//             carry = sum / 10;
//             tail.next = new Node(sum % 10);
//             tail = tail.next;
//         }
        
//         // Reverse result to get MSD first
//         Node result = reverse(dummy.next);
        
//         // Remove leading zeros (but keep one zero if all zeros)
//         while (result != null && result.data == 0 && result.next != null) {
//             result = result.next;
//         }
        
//         return result;
//     }
// }

class Solution {
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // find middle
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        Node prev = null, curr = slow;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        // compare halves
        Node left = head, right = prev;
        while (right != null) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}