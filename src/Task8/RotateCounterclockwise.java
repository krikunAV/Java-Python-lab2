package Task8;
import java.util.Arrays;

public class RotateCounterclockwise {

    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] rotateMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotateMatrix[i][j] = matrix[j][m-1-i];
            }
        }
        return rotateMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, -4},
                {4, 5, 6, -7},
                {7, 8, 9, 10}
        };
        matrix = rotate(matrix);

        for(int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}