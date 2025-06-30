import java.util.Scanner;

public class RowSumMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        findRowSumsAndMax(matrix);
        
        sc.close();
    }
    
    public static void findRowSumsAndMax(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[] rowSums = new int[rows];
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nRow Sums:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
            
            System.out.println("Row " + (i + 1) + " sum: " + sum);
            
            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = i;
            }
        }
        
        System.out.println("\nMaximum row sum: " + maxSum);
        System.out.println("Row with maximum sum: Row " + (maxRowIndex + 1));
    }
    
    // Alternative method that returns results
    public static RowSumResult getRowSumsAndMax(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[] rowSums = new int[rows];
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
            
            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = i;
            }
        }
        
        return new RowSumResult(rowSums, maxSum, maxRowIndex);
    }
    
    // Example with your input
    public static void exampleDemo() {
        System.out.println("=== YOUR INPUT EXAMPLE ===");
        
        int[][] matrix = {
            {1, 4, 3},
            {1, 1, 1},
            {1, 6, 3},
            {2, 4, 8}
        };
        
        findRowSumsAndMax(matrix);
    }
}

// Helper class to store results
class RowSumResult {
    int[] rowSums;
    int maxSum;
    int maxRowIndex;
    
    public RowSumResult(int[] rowSums, int maxSum, int maxRowIndex) {
        this.rowSums = rowSums;
        this.maxSum = maxSum;
        this.maxRowIndex = maxRowIndex;
    }
    
    public void printResults() {
        System.out.println("Row sums:");
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }
        System.out.println("Maximum sum: " + maxSum + " (Row " + (maxRowIndex + 1) + ")");
    }
}