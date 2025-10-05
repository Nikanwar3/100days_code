// import java.util.*;

public class AdvancedLinearSearch {
    public static List<Integer> linearSearchAll(int[] numbers, int key) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, 4, 10, 12, 4, 14, 16};
        int key = 4;

        List<Integer> result = linearSearchAll(numbers, key);
        if (result.isEmpty()) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at indices: " + result);
        }
    }
}