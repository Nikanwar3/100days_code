
// // // public class binaryTree{


// // //     static class Node{
// // //         int data;
// // //         Node left = null;
// // //         Node right = null;
// // //         Node(int data){
// // //             this.data = data;
// // //             this.right = null;
// // //             this.left = null;

// // //         }

// // //         static class BinaryTree{
// // //              static int index = -1;
// // //              public static Node buildTree(){
// // //         }
// // //     }
// // //         public static void main(String[]args){ 
// // //         int node [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; // 
// // //     }
// // // }
// // public class binaryTree{


// //     static class Node{
// //         int data;//
// //         Node right;
// //         Node left;
// //         Node(int data){
// //             this.data = data;//
            
// //             this.right = null;//
// //             this.left = null;
// //         }
// //     }
// //     static class BinaryTree{
// //         static int index = -1;
// //         public static Node buildTree(int nodes[]){
// //             index++;
// //             if(nodes[index] == -1){
// //                 return null;
// //             }
// //             Node newNode = new Node(nodes[index]);
// //             newNode.left = buildTree(nodes);
// //             newNode.right = buildTree(nodes);
// //             return newNode;
// //         }
// //     }

// //     public static void main(String[]args){
// //         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //nodes
// //         //
// //         //

// //     }
// // }
// import java.io.*;
// import java.util.*;

// public class binaryTree {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int t = Integer.parseInt(br.readLine());
//         while (t-- > 0) {
//             String[] parts = br.readLine().split(" ");
//             long a = Long.parseLong(parts[0]);
//             long b = Long.parseLong(parts[1]);

//             int ans = 0;
//             long white1 = 0, dark1 = 0;  // case 1: top white
//             long white2 = 0, dark2 = 0;  // case 2: top dark
//             long cur = 1;

//             while (true) {
//                 boolean ok = false;

//                 // case 1
//                 if (ans % 2 == 0) white1 += cur;
//                 else dark1 += cur;

//                 // case 2
//                 if (ans % 2 == 0) dark2 += cur;
//                 else white2 += cur;

//                 if ((white1 <= a && dark1 <= b) ||
//                     (white2 <= a && dark2 <= b)) {
//                     ok = true;
//                 }

//                 if (!ok) break;

//                 ans++;
//                 cur <<= 1;
//             }

//             sb.append(ans).append("\n");
//         }

//         System.out.print(sb.toString());
//     }
// }

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);//
        int n = sc.nextInt();// input n
        
        long fact = 1;//
        int i = 1;//
        
        do {
            fact *= i;
            i++;
        } while(i <= n);
        
        System.out.println(fact);// print fact
    }
}