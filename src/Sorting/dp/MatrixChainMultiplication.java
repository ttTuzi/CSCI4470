package Sorting.dp;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2/7/2023 9:39 PM
 */
public class MatrixChainMultiplication {
    public static void main(String args[])
    {
        int arr[] = new int[] { 9, 3, 8, 2, 5, 6 };
        int N = arr.length;

        // Function call
        System.out.println(
                "Minimum number of multiplications is "
                        + MatrixChainOrder(arr, 1, N - 1));
    }

    public static int MatrixChainOrder(int p[], int i, int j)
    {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        // Place parenthesis at different places
        // between first and last matrix,
        // recursively calculate count of multiplications
        // for each parenthesis placement
        // and return the minimum count
        for (int k = i; k < j; k++) {
            int count = MatrixChainOrder(p, i, k)
                    + MatrixChainOrder(p, k + 1, j)
                    + p[i - 1] * p[k] * p[j];

            if (count < min)
                min = count;
        }

        // Return minimum count
        return min;
    }
}
