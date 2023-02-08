package Sorting;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月24日 2:26 PM
 */
public class QuickSort {
    static int x = 0;
    public static void main(String[] args) {
        int[] arr= {2,25,5,21,8,11,16};
        int[] arr1= {8,7,6,5,4,3,2,1};
        Sort(arr1,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        System.out.println(x);
    }

    public static void Sort(int[] arr,int low,int high){
        if(low<high) {
            int p = Partition(arr,low,high);
            Sort(arr, low, p - 1);
            Sort(arr, p + 1, high);
        }
    }

    public static int Partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;
        //int x=0;
        for(int j = low;j<=high-1;j++){
            if(arr[j]<=pivot){
                i++;
                x++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
            }
        }
        //System.out.println(x);
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        System.out.println(Arrays.toString(arr));
        return i+1;
    }
}
