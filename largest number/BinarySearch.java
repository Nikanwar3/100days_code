// import java.util.*;
// public class BinarySearch{
//     public static 
// }

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); // sort by id
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class BinarySearch {

    // Generic recursive binary search
    public static <T extends Comparable<T>> int binarySearchRecursive(List<T> list, T key, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        T midVal = list.get(mid);
        int cmp = key.compareTo(midVal);
        if (cmp == 0) return mid;
        else if (cmp < 0)
            return binarySearchRecursive(list, key, low, mid - 1);
        else
            return binarySearchRecursive(list, key, mid + 1, high);
    }

    // Generic iterative binary search
    public static <T extends Comparable<T>> int binarySearchIterative(List<T> list, T key) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = list.get(mid);
            int cmp = key.compareTo(midVal);
            if (cmp == 0) return mid;
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Aditi"));
        students.add(new Student(104, "Karan"));
        students.add(new Student(106, "Meera"));
        students.add(new Student(110, "Zara"));

        // sort list before binary search
        Collections.sort(students);

        System.out.println("Students sorted by ID:");
        for (Student s : students) System.out.println(s);

        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        Student key = new Student(id, ""); // dummy name for comparison

        // Use recursive search
        int index = binarySearchRecursive(students, key, 0, students.size() - 1);
        if (index != -1)
            System.out.println("Found (recursive) at index " + index + ": " + students.get(index));
        else
            System.out.println("Not found (recursive)");

        // Use iterative search
        int index2 = binarySearchIterative(students, key);
        if (index2 != -1)
            System.out.println("Found (iterative) at index " + index2 + ": " + students.get(index2));
        else
            System.out.println("Not found (iterative)");
    }
}