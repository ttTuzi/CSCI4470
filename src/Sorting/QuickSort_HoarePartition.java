package Sorting;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月24日 2:26 PM
 */
public class QuickSort_HoarePartition {
    static int x = 0;
    public static void main(String[] args) {
        int[] arr= {13,19,9,5,12,8,7,4,11,2,6,21};
        int[] arr1= {8,7,6,5,4,3,2,1};
        Sort(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr,int low,int high){
        if(low<high) {
            int p = Partition(arr,low,high);
            Sort(arr, low, p );
            Sort(arr, p + 1, high);
        }
    }

    public static int Partition(int[] arr,int low, int high){
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;
        //int x=0;
        while(true) {
            do {
                j--;
            } while ((arr[j] > pivot));

            do {
                i++;
            } while (arr[i] < pivot);


            if (i >= j) {
                System.out.println("========="+" "+arr[low]+" " +arr[j]+" "+arr[high]);
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
        }

    }
}
