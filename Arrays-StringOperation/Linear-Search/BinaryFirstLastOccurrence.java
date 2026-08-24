public class BinaryFirstLastOccurrence {

    public static int findFirst(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                answer = middle;
                right = middle - 1;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return answer;
    }

    public static int findLast(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                answer = middle;
                left = middle + 1;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first = findFirst(numbers, target);
        int last = findLast(numbers, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}