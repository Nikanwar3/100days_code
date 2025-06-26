public class Queue {
    static class Queue {
        static int arr[];
        static int size;
        Queue (int n ) {
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data) {
            if(rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear ++;
            arr[rear] = data;

        }

        public static void main(string[]args) {

        }
    }
}