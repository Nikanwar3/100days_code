// import java.util.*;
// public class BasicArray {
//     public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//         int marks[] = new int [100];
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         System.out.println("physics : " + marks[0]);
//         System.out.println("chemistry : " + marks[1]);
//         System.out.println("biology : " + marks[2]);



//     }
// }

import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3]; // Only 3 subjects

        String[] subjects = {"Physics", "Chemistry", "Biology"};

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nEntered marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
    }
}