package Task_6;

public class SumOfMatrix {

    public static int sumElements(int[][] arr) {
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                currSum += arr[i][j];
            }
        }
        return currSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(sumElements(matrix));
    }
}