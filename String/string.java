import java.util.*;

public class string{
    public static void printLetters(String str){
        for(int i =0; i<str.length();i++){
            System.out.print(str.charAt(i) + "");
        }
        System.out.println();
    }

    public static void main(String[]args){
        // String str = "abcd";
        // String str2 = new String("abcd");
        // Scanner sc = new Scanner(System.in);//
        // String name ;
        // name = sc.nextLine();
        String name = "Nidhi";//
        String surname = "Kanwar";
        String fullName = name + " " + surname;// to concatenate two strings

        // System.out.println(fullName);//
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(3));
        printLetters(fullName);//

    }
}