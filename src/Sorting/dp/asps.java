package Sorting.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 4/11/2023 11:39 PM
 */
public class asps {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 555, 555, -3, 555},
                {-4,0,555,555,555},
                {555,-2,0,555,555},
                {555,555,555,0,7},
                {555,1,5,555,0}
        };
        Integer[][] matrix2 = {
                {0, 3, 555,7},
                {8,0,2,555},
                {5,555,0,1},
                {2,555,555,0}
        };
//        for k in range(n):
//        for i in range(n):
//        for j in range(n):
//        if D[i][j] > D[i][k] + D[k][j]:
//        D[i][j] = D[i][k] + D[k][j]
        apsp(matrix2);

    }

    public static void apsp(Integer[][] matrix){
        //int[][] nMatrix = new int[matrix.length][matrix.length];
        List<Integer[][]> list = new ArrayList<>();
        list.add(matrix);
        for(int k=0;k<matrix.length;k++){
            Integer[][] nMatrix = new Integer[matrix.length][matrix.length];
            Integer[][] prevMatrix = list.get(k);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    //nMatrix[i][j]=prevMatrix[i][j];
                    nMatrix[i][j]=Math.min(prevMatrix[i][j],prevMatrix[i][k]+prevMatrix[k][j]);
                    System.out.printf("%-5s",nMatrix[i][j]);
                }
                System.out.println(" ");
            }
            list.add(nMatrix);
            System.out.println(" ");

        }
    }
}
