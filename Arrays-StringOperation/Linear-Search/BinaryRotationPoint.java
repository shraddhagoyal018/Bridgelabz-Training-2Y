public class BinaryRotationPoint {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;

            if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        System.out.println("Rotation index: " + left);
        System.out.println("Smallest value: " + numbers[left]);
    }
}