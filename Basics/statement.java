// we have to print 1  to n . n will deide by taking input from user
import java.util.*;
public class statement{
    public static void main(String[]args){
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(counter<=n){
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}