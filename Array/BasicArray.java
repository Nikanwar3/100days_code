import java.util.*;
public class BasicArray {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        int marks[] = new int [100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("physics : " + marks[0]);
        System.out.println("chemistry : " + marks[1]);
        System.out.println("biology : " + marks[2]);



    }
}