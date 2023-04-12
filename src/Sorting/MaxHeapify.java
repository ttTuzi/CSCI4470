package Sorting;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/18/2023 7:35 PM
 */
public class MaxHeapify {
    public static void main(String[] args) {
        int[] A = {12,19,1,40,6,13,17,50,33,45,11};
        for(int i=A.length/2-1;i>=0;i--){
            MaxHeap(A,i);
        }
        System.out.println(Arrays.toString(A));
    }

    public static void MaxHeap(int[] A,int i){
        int l = i*2+1;
        int r = i*2+2;
        int max = i;
        if(l<=A.length-1 && A[l]>A[i]){
            max = l;
        }else{
            max=i;
        }

        if(r<=A.length-1 && A[r]>A[max]){
            max=r;
        }
        if(max!=i){
            int tem = A[i];
            A[i]=A[max];
            A[max] = tem;
            MaxHeap(A,max);
        }

    }
}
