 class reverse {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1; //first declare first and end point 
        
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;    
            last--;
        }
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        reverse(numbers);
        
        System.out.println("Reversed array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}