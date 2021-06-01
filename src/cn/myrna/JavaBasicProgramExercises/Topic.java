package cn.myrna.JavaBasicProgramExercises;

public class Topic {

    public static void main(String[] args) {
        //TopicOne();
        TopicTwo();
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
    public static void TopicTwo(){
        double money = 1;
        int day = 1;

        while (money < 10){
            money *= 1.5;
            day++;
            System.out.println("天数:"+day+","+"金额:"+money);
        }
        System.out.println("天数："+day);
    }
}
