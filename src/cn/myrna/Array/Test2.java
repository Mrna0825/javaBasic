package cn.myrna.Array;

//数组索引从0开始，长度为5也就是[0,1,2,3,4]


public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5,4,3,2,1};
        //System.out.println(arr1[1]);
        /*
        初始化动态数组时，会生成默认值
        整型：0
        浮点：0.0
        字符：\u0000
        布尔：false
        引用：null
        */
        int[] arr2 = new int[5];
        arr2[0] = 1;
    }
}
