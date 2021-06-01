package cn.myrna.Array;
/*
数组反转
需要两个索引来表示对称位置
int l = 0;
int r = arr.length-1;
需要一个temp来存储临时变量来实现两个变量的交换
int temp = arr[a];
arr[a] = arr[b];
arr[b] = temp;

 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int elem : arr){
            System.out.print(elem+",");
        }
        arr = reverse1(arr);
        System.out.println();
        for(int elem : arr){
            System.out.print(elem+",");
        }

    }

    //Implementation method ONE
    public static int[] reverse(int[] arr){
        //遍历数组
        //什么时候停止交换：left==right时、left>right时；
        //什么时候应该交换：left<right时;
        for (int left = 0, right = arr.length - 1; left < right; left++, right--){
            //实现交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }

    //Implementation method TWO
    public static int[] reverse1(int[] arr){
        //遍历数组
        for (int i = 0; i < arr.length/2; i++) {
            //实现交换
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //Implementation method Three
    public static int[] reverse2(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = arr.length-1; i >= 0 ; i--) {
            //arr1[0] = arr[5] the first time
            //arr1[1] = arr[4] the second time
            //..............
            arr1[arr.length-i-1] = arr[i];
        }
        return arr1;
    }
}
