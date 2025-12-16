// import java.util.*;
// public class operator {
// public static void main(String[] args) {
//     // int a = 10;
//     // int b = 10;
//     // System.out.println((a<=b));
//     // int age = 16;
// Scanner sc = new Scanner(System.in);

//     // if(age >= 17 ) {
//     //     System.out.println("you can drive");
//     // }
//     // else {
//     //     System.err.println("you cannot drive");
//     // }
//     // int n = sc.nextInt();
//     // if (n % 2 == 0) {
//     //     System.out.println("even");
//     // } else {
//     //     System.out.println("odd");
//     //     }
//     // int income = sc.nextInt();
//     // int tax;
//     // if (income < 500000) {
//     //     System.out.println("No tax");
//     //     tax=0;
//     // } else if (income >= 500000 && income < 1000000) {
//     //     System.out.println("10% tax");
//     //     tax= (int)(income * 0.1);
//     // } else if (income >= 1000000 && income < 2000000) {
//     //     System.out.println("20% tax");
//     //     tax= (int)(income * 0.2);
//     // } else {
//     //     System.out.println("30% tax");
//     //     tax= (int)(income * 0.3);
//     // }
//     // else if (income>=500000 && income< 1000000) {
//     //     tax= (int)(income*0.2);
//     // } 
//     // int a = 1;
//     // int b =3;
//     // int c = 6;

//     // if((a>=b ) && (a>=c)) {
//     //     System.out.println("a is largest");


//     // }
//     // else if (b>=c) {
//     //     System.out.println("b is largest");
//     // }
//     // else {
//     //     System.out.println("c is largest");
//     // }
// //    System.out.println("enter a: ");
// //     int a = sc.nextInt();
// //     System.out.println("enter b: ");
// //     int b = sc.nextInt();
// //     System.out.println("enter operator: ");
// //     char operator = sc.next().charAt(0);

// //     switch(operator) {
// //         case '+': System.out.println(a+b);
// //         break;
// //         case '-' : System.out.println(a-b);
// //         break;
// //         case '*' : System.out.println(a*b);
// //         break;
// //         case '%' : System.out.println(a%b);
// //         break;
// //         case '/' : System.out.println(a/b);
// //         break;
// //         default: System.out.println("wrong ");
        
// //     }

// // int n = sc.nextInt();
// // if(n>=0) {
// //     System.out.println("positive");
// // } 
// // else  {
// //     System.out.println("negative");

// // }
// // System.out.println("enter year : ");
// // int year = sc.nextInt();
// // if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
// //     System.out.println("leap");
// //     else{
// //         System.out.println();
// //     }
// // }

//         System.out.println("Code" + "Chef");//
//     }
// }
public class operator {
    public static void main(String[] args) {//
        int a = 10, b = 20, c = 30, d = 15;//

        if ((a > b || c < d) || (a == d && c > b)) {
            System.out.println("At least one complex condition is true.");
        } else {
            System.out.println("None of the conditions are true.");
        }
    }
}

