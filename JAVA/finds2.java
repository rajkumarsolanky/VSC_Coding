public class finds2 {
    public static void main(String[] args) {
        int[] numbers = {67, 56, 78, 99, 34, 2, 98, 90};

        
        int largest = numbers[0];
        int smallest = numbers[0];

    
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
            
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
            
                smallest = numbers[i];
            }
        }

        
        System.out.println("The largest number in the array is " + largest);
        System.out.println("The smallest number in the array is " + smallest);
    }
}
