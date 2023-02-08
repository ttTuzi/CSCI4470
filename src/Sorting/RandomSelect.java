package Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月02日 7:33 PM
 */
public class RandomSelect {
    public static void main(String[] args) {
        int[] arr = {6,19,4,12,14,9,15,7,8,11,3,13,2,5,10};
        RS(arr,0,arr.length-1,1);
        System.out.println(Arrays.toString(arr));
    }

    public static int RS(int[] arr,int p,int r,int i){
        if(p==r){
            return arr[p];
        }
        int q = RP(arr,p,r);
        int k = q-p+1;
        if(i==k){
            return arr[q];
        }else if(i<k){
            return RS(arr,p,q-1,i);
        }else {
            return RS(arr,q+1,r,i-k);
        }
    }

    public static int RP(int[] arr,int p,int r){
        Random rand= new Random();
        int pivot = rand.nextInt(r-p)+p;

//        int temp1=arr[pivot];
//        arr[pivot]=arr[r];
//        arr[r]=temp1;
        return pivot;
    }
}
