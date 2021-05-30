package cn.myrna.JavaSyntax;

import java.util.Arrays;

public class BubblerSort {
    public static void bubblerSort(int[] arr){
            int temp;
            for(int i = 0; i<arr.length-1;i++){
                for (int j = 0; j <arr.length-i-1; j++) {
                    if(arr[j+1]<arr[j]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]  = temp;
                    }
                }
            }
    }

    public static void main(String[] args) {

        int arr[] = new int[]{3,15,6,7,88,9,1,2,8};
        BubblerSort.bubblerSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
