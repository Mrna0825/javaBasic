package cn.myrna.javaSyntax;

public class Overload {

/*
* 方法的重载：多个方法的名称一样，参数不一样
*
* 与因素相关：
* 1、参数个数不同、参数类型不同、参数的多类型顺序不同
*
* 与因素无关：
* 1、与参数的名称、方法返回值、修饰符无关
* */

    public static void main(String[] args) {

        //调用判断数据类型方法
        System.out.println(isSame(10,13));
        System.out.println(isSame((short) 12,(short)10));
        System.out.println(isSame(10L,10L));

        byte a = 1;
        byte b = 2;
        System.out.println(isSame(a,b));


    }


    public static boolean isSame(byte a, byte b){
        System.out.println();
        System.out.println("byte");
        boolean same;
        if(a ==b ){
            same = true;
        }else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(int a ,int b){
        System.out.println();
        System.out.println("int");

        if(a == b) {
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean isSame(short a ,short b){
        System.out.println();
        System.out.println("short");
        boolean same = a == b ? true:false;

        return same;
    }

    public static boolean isSame(long a , long b){
        System.out.println();
        System.out.println("long");
        return a==b;
    }


    public static int sum(int a, int b){
        
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(double a, int b){
        return (int)a+b;
    }


}
