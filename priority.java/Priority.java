
// // import java.util.Comparator;
// // import java.util.PriorityQueue;

// // public class Priority{
// //     public static void main(String[]args){
// //         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
// //         pq.add(3); 
// //         pq.add(2);
// //         pq.add(1);   //O(log n)

// //         while(! pq.isEmpty()){
// //             System.out.println(pq.peek());   //O(1)
// //             pq.remove();;   //O(log n)
// //         }
// //     }
    
// // }

// // import java.util.PriorityQueue;;
// // public class Priority{
// //     static class Student implements Comparable<Student> {
// //         String name;
// //         String rank;

// //         public Student(String name, int rank){      //constructor 
// //             this.name = name;
// //             this.rank = rank;
// //         }
// //     @Overrride
        

// //     }
// // }

// import java.util.PriorityQueue;

// public class Priority{
//     static class Student implements Comparable<Student>{
//         String name;
//         int rank;

//         public Student(String name, int rank){      //constructor
//             this.rank = rank;
//             this.name = name;

//         }
//         @Override
//         public int compareTo(Student s2){
//             return this.rank - s2.rank;
//         }
//     }
// }

import java.util.PriorityQueue;

public class Priority {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;//
        }

        @Override
        public int compareTo(Student s2) {//
            return this.rank - s2.rank;  // Ascending order of rank
        }
    }

    public static void main(String[] args) {//
        PriorityQueue<Student> pq = new PriorityQueue<>();//
        pq.add(new Student("A", 2));//
        pq.add(new Student("B", 1));//

        while (!pq.isEmpty()) {         //loop until the queue is empty
            // Peek the student with the highest priority (lowest rank)
            // System.out.println(pq.peek().name + " " + pq.peek().rank);
            // Remove the student with the highest priority
            Student s = pq.remove();
            System.out.println(s.name + " " + s.rank);//print
        }
    }
}