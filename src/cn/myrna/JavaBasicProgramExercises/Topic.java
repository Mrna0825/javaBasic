package cn.myrna.JavaBasicProgramExercises;

import java.util.Random;

public class Topic {

    public static void main(String[] args) {
        TopicSeven();
    }

    //题目1：打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
    public static void TopicOne(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //跳过i÷7的余数=0、i÷10的余数=7、i÷10=7的数
            if(i%7==0 || i%10==7 || i/10==7){
                continue;
            }
            System.out.print(i+"、");
            sum+= i ;
        }
        System.out.println("总和"+sum);
    }

    //题目二：有一个有钱的神经病，他往银行里存钱，
    //第一天存1元,以后每天比前一天多存50%，完成下列计算任务
    //1)他存到第几天，当天存的钱会超过10元
    //2)一个月（30天）后，他总共存了多少钱
    public static void TopicTwo(){
        double money = 1;
        int day = 1;
        while (money < 10){
            money *= 1.5;
            day++;
            System.out.println("天数:"+day+","+"金额:"+money);
        }

        double sum=0;
        double mo=1;
        for(int i=1;i<=30;i++) {
            sum+=mo;
            System.out.println("i:"+i+",money:"+mo+",sum:"+sum);
            mo*=1.5;
        }
        System.out.println(sum);
    }

    //井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
    //计算蜗牛需要多少天才能从井底到爬出来
    public static void TopicThree(){
        //天数
        int day = 1;
        //爬行米数
        double sum = 0;
        while(true){
            sum+=5;
            System.out.println("记录天数"+day+",记录米数"+sum);
            if (sum >= 56.7){

                break;
            }
            sum-=3.5;
            day++;
        }
        System.out.println("蜗牛:爬了"+day+"天,终于爬出来了");
    }

    //用 while 循环，计算 1~200 之间所有 3 的倍数之和。
    static void TopicFour(){
        int a = 1;
        int sum = 0;
        while (a<=200){
            if(a%3==0){
                sum += a;
            }
            a++;
        }
        System.out.println(sum);
    }

    //使用循环语句输出下面的图形。
    //#
    //# # #
    //# # # # #
    //# # # # # # #
    //# # # # # # # # #
    static void TopicFive(){
        int aa = -1;
        for (int a = 0; a < 5; aa++, a++) {
            aa += 1;
            for (int b = 0; b <= aa; b++) {
                System.out.print("￥");
            }
            System.out.println();
        }
    }

    /*
     * 验证“鬼谷猜想”：对任意自然数，若是奇数，
     * 就对它乘以3再加1；若是 偶数，就对它除以2，
     * 这样得到一个新数，
     * 再按上述计算规则进行计算，
     * 一直进 行下去，最终必然得到1。
     * */
    static void TopicSix(){
        int num = 0;
        int num1 = 0;
        Random random = new Random();
        //Integer.MAX_VALUE为最大的整数
        num = 1+random.nextInt(Integer.MAX_VALUE);
        //System.err.println(rd.nextInt(100));//产生数>=0且<100
        System.out.println("原本的数为"+num);
        while(num!=1){
            System.out.println("产生的新数："+num);
            if(num%2==0){
                num = num /2;
            }else{
                num = num*3+1;
            }
        }
        System.out.println(num);
    }

    static void TopicSix1(){
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("原数："+num);
        for (int i = 0;; i++) {
            if(num%2==0){
                num/=2;
            }else{
                num=num*3+1;
            }
            if (num==1){
                System.out.println(num);
                break;
            }
            System.out.println(num);
        }


    }

    //猴子吃桃问题。猴子第一天摘下若干个桃子，当时就吃了一半，还不过瘾，
    //就又吃了一个。第二天又将剩下的桃子吃掉一半，又多吃了一个。以后每天都吃
    //前一天剩下的一半零一个。到第 10 天在想吃的时候就剩一个桃子了,求第一天共s
    //摘下来多少个桃子？
    static void TopicSeven(){
        int total = 1;//得到第十天的桃子往前推
        int day = 10;

        for (int i = 10; i > 0; i--) {
            System.out.println("天数:"+day+"桃子数:" + total);
            total = (total+1)*2;//反推猴子吐出来的桃子.....
            day--;
         }
    }
}
