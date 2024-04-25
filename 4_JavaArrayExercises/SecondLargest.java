public class SecondLargest {
    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if (array.length <= 1) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n: array) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}
