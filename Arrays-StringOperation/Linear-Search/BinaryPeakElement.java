public class BinaryPeakElement {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 4, 2};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;

            if (numbers[middle] < numbers[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        System.out.println("Peak index: " + left);
        System.out.println("Peak value: " + numbers[left]);
    }
}