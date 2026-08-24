
public class LinearMissingPositiveBinaryTarget {

    public static int findMissingPositive(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            while (
                    numbers[i] > 0 &&
                    numbers[i] <= n &&
                    numbers[numbers[i] - 1] != numbers[i]
            ) {
                int correctIndex = numbers[i] - 1;

                int temporary = numbers[i];
                numbers[i] = numbers[correctIndex];
                numbers[correctIndex] = temporary;
            }
        }

        for (int i = 0; i < n; i++) {
            if (numbers[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1};

        int missing = findMissingPositive(numbers);

        System.out.println("First missing positive: " + missing);

        int[] sortedNumbers = {1, 2, 3, 4, 5};
        int target = 4;

        int index = binarySearch(sortedNumbers, target);

        System.out.println("Target index: " + index);
    }
}