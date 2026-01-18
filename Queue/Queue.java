// public class Queue {
//     static class Queue {
//         static int arr[];
//         static int size;
//         Queue (int n ) {
//             arr = new int[n];
//             this.size = n;
//         }
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         public static void add(int data) {
//             if(rear == size-1){
//                 System.out.println("full queue");
//                 return;
//             }
//             rear ++;
//             arr[rear] = data;
// // rear
//         }

//         public static void main(string[]args) {

//         }
//     }
// }

// public class Queue {
//     static class Queue {
//         static int arr[];
//         static int size;
//         Queue (int n ) {
//             arr = new int[n];
//             this.size = n;
//         }
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         public static void add(int data) {
//             if(rear == size-1){
//                 System.out.println("full queue");
//                 return;
//             }
//             rear ++;
//             arr[rear] = data;
// // rear
//         }

//         public static void main(string[]args) {

//         }
//     }
// }


public class Queue {//
    static int arr[];//
    static int size;//
    static int rear = -1;//
    static int front = -1;

    Queue(int n) {
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty() {//
        return rear == -1;
    }

    public static void add(int data) {// 
        if (rear == size - 1) {
            System.out.println("Queue full");//queue is full
            return;//
        }//
        rear++;
        arr[rear] = data;//
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        System.out.println(q.isEmpty());
    }
}

