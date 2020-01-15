import java.util.Arrays;

public class TriangularMatrixToArray {

    public static void main(String[] args) {
        UpperTriangularToArray();
        LowerTriangularToArray();
    }

    private static void LowerTriangularToArray() {
        // create 2D Matrix
        int matrix[][] = {{1, -1, -1, -1},
                {2 , 3, -1, -1},
                {4, 5, 6, -1},
                {7, 8, 9, 10}};

        int n = matrix.length;

        // create 1D Array to hold output
        // --Formula is that if the size of the
        //     triangular matrix is n, then the size
        //     of the 1D array is n * (n + 1) / 2
        int[] array = new int[(n * (n + 1)) / 2];

        // loop through converting
        // --Formula to convert to 1D array index is
        //     if row number is >= to column then add to 1D array
        for (int row = 0, index = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row >= col) {
                    array[index] = matrix[row][col];
                    index++;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void UpperTriangularToArray() {
        // create 2D Matrix
        int matrix[][] = {{1, 2, 3, 4},
                {-1 , 5, 6, 7},
                {-1, -1, 8, 9},
                {-1, -1, -1, 10}};

        int n = matrix.length;

        // create 1D Array to hold output
        // --Formula is that if the size of the
        //     triangular matrix is n, then the size
        //     of the 1D array is n * (n + 1) / 2
        int[] array = new int[(n * (n + 1)) / 2];

        // loop through converting
        // --Formula to convert to 1D array index is
        //     if row number is <= to column then add to 1D array
        for (int row = 0, index = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row <= col) {
                    array[index] = matrix[row][col];
                    index++;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }


}
