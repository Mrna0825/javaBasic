package cn.myrna.JavaBasicProgramExercises;

public class Topic {

    public static void main(String[] args) {
        //TopicOne();
        //TopicTwo();
        TopicThree();
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
}
