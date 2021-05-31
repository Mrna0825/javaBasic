package cn.myrna.Array;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {10,2,3,14,5,6};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println(min);
    }
}
