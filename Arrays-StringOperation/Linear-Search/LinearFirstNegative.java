public class LinearFirstNegative {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, -4, 7, -9};

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println("First negative number index: " + index);
    }
}