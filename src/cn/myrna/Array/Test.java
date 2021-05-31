package cn.myrna.Array;
/*
数据是一种引用数据类型
初始化：在内存当中创建一个数组，并且向其赋值
分为动态和静态（前者指定长度，后者指定内容）

使用建议：
不确定数组中的内容用动态初始化格式，确定了内容用静态初始化格式

动态初始化格式：
数据类型 [] 数组名 = new 数据类型[长度];

静态初始化格式：会根据内容得到数组长度
数据类型 [] 数组名 = new 数据类型[]{x,xx,xxx,......};

省略格式:
数据类型 [] 数组名 = {x,xx,xxx,.....};
*/

public class Test {

    public static void main(String[] args) {
        //动态，也可以拆分两个步骤
        //int y;
        //y = new int[z];
        int [] arr1 = new int[300];
        double [] arr2 = new double[10];
        String [] arr3 = new String[5];

        //静态，也可以拆分两个步骤
        //int x;
        //x = new int[]{x,xx,xxx,.....};
        int [] arrA = new int[]{1,2,34,6};
        String [] arrB = new String[]{"a","b"};

        //省略
        int [] arrJ = {1,2,3,4,5};
    }

}
