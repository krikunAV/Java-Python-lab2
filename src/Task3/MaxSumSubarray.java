package Task3;

public class MaxSumSubarray {

    public static int maxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for(int i = 0; i < array.length; i++) {
            currentSum += array[i];

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, -2,  4,  5, -6,  8,  -9},
                { 1,  2,  4,  5, -6,  8 , -9},
                {-1, -1, -2, -1, -1, -1,   0},
                {-1, -1, -1, -1, -1, -1,  -1},
                { 2, -5,  5,  6,  7,  1,   3},
                {-1, -1, -1, -1, -1, -1,   1}
        };

        for(int[] arr : matrix) {
            System.out.println(maxSum(arr));
        }
    }
}