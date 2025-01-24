public class DiagonalMatrixSum {
    public static int diagonalSum(int arr[][]) {

        // daigonal sum = primar diagonal+secondary daigonal;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }

                else if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }

            }

        }
        return sum;
    }

    public static int diagonalSumWithBatterTimeCompexsity(int arr[][]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            // pd
            sum += arr[i][i];

            // sd
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // System.out.println("Diagonal Sum of Matrix is  =  " + diagonalSum(arr));

        System.out.println("Diagonal Sum of Matrix is  =  " + diagonalSumWithBatterTimeCompexsity(arr));
    }
}
