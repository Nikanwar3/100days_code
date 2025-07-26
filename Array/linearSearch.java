public class linearSearch{
    public static int linear(int numbers[],int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return-1;
        
    }

    public static void main(String[]args){
        int numbers[] = {5, 3, 8, 4, 2};
        int key = 8;
        int index = linear( numbers, key);
        if(index == -1) {
            System.out.println("not found"); // if the key is not found
        }
        System.out.println();

    }
}






