public class Main {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);

        int smallest = findSmallest(numbers);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }
}
