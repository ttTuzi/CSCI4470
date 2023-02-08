package Sorting;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月30日 8:38 PM
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr= {2,25,5,21,8,11,16};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        max = arr[max];

        while(max>0){
            
        }
    }
}
