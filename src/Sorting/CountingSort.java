package Sorting;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月30日 3:20 PM
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 0, 2, 4, 5, 1, 3, 0, 4, 3, 2, 4};
        int[] index = new int[10];
        int i = 0;
        while(i<arr.length){
            index[arr[i]]++;
            i++;
        }
        int j=0;
        int[] out = new int[arr.length];
        for(int k=0;k<9;k++){
            index[k+1]=index[k]+index[k+1];
        }
        System.out.println(Arrays.toString(index));
        while(j<arr.length){
            int ind = index[arr[j]]-1;
            int val = arr[j];
            out[ind]=arr[j];
            index[arr[j]]--;
            j++;
        }
        System.out.println(Arrays.toString(out));

    }



}
