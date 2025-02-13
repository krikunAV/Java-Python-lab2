package Task5;

import java.util.Arrays;

public class FindNumbersEqualSum {

    public static int[] findNumbers(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (curr + arr[j] == number) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,-3, 4, 5,-6, 9, 11, 12};

        System.out.println(Arrays.toString(findNumbers(arr, 3)));
        System.out.println(Arrays.toString(findNumbers(arr, 20)));
        System.out.println(Arrays.toString(findNumbers(arr, 100)));
    }
}