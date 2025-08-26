import java.util.*;
public class Basic {

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest) {  // Fixed this condition
                smallest = numbers[i];
            }
        }
        return smallest;
    }  // Added this missing closing brace

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("smallest number is : " + getSmallest(numbers));
        
        Scanner sc = new Scanner(System.in);
        float a = 4.4f;
        int b = (int)a;
        System.out.println(b);

        char a = 'a'; // character 'char' cannot be redeclared in the same scope
        char b = 'b';// character ,,
       
        // System.err.println((int)a);
        // System.err.println((int)b);
        // System.out.println(a-b);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int N = (a+b+c)/3;
        // System.out.println(N);

        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println(area); print

        // float pencil = 10.5f; // float
        // float pen = 20.5f; // float
        // float eraser = 5.5f;
        // int $ =24;
    }
} //