package Recursive;

public class recursive {
    public static void recursiveFunction(int n) {
        if (n <= 0) {
            System.out.println("Base case reached");
            return;
        }
        System.out.println("Current value: " + n);
        recursiveFunction(n - 1);

    }
    public  static void main(String[] args) {
        
    }

    
}
