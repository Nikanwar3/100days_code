// import java.util.*;
// public class array {
// public static void main (String[] args) {
//     int [][] array = {{4,7,8},{8,8,7}};

//     int countof7 = 0;
//     for(int i =0; i <array.length; i ++) {
//         for(int j=0; j<array[0].length;j++){
//             if(array[i][j] == 7) {
//                 countof7++;

//             } 
//         }
//     }
//     System.out.println("Count of 7 is : " + countof7);

// }
// }
    



import java.util.*;
public class ArrayCount {
    public static void main(String[] args) {
        int [][] array = {{4,7,8},{8,8,7}};

        int countof7 = 0;

        // Dry run explanation:
        // i | j | array[i][j] | countof7
        // --------------------------------
        // 0 | 0 |     4       |    0
        // 0 | 1 |     7       |    1
        // 0 | 2 |     8       |    1
        // 1 | 0 |     8       |    1
        // 1 | 1 |     8       |    1
        // 1 | 2 |     7       |    2

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countof7++;
                }
            }
        }

        System.out.println("Count of 7 is : " + countof7);
    }
}