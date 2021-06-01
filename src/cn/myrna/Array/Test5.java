package cn.myrna.Array;

public class Test5 {
    public static void main(String[] args) {
        int[] result = calculate(1,1,1);

        System.out.println("总和:"+result[0]);
        System.out.println("平均:"+result[1]);

    }

    public static int[] calculate(int a, int b , int c){
        int sum = a+b+c;
        int avg = sum/3;

        int [] arr = {sum,avg};
        return arr;
    }
}
