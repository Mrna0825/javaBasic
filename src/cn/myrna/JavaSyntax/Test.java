package cn.myrna.JavaSyntax;

public class Test {

    public static void printLn_Method(){
        for (int i = 0; i < 5; i++) {

            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static int method_sum(int a,int b){

        int result = a + b;

        return result;
    }


    public static void addition1_100(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        //printLn_Method();
        //System.out.println(method_sum(1,2));
        //int num = method_sum(5,5);
        //System.out.println(num);
        addition1_100();

    }
}
