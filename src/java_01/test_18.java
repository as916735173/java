package java_01;
//for循环
/*
for（）
 */
public
class test_18 {
    public static void main(String[] args){
        //保存最终结果
        int sum=0;
        //控制循环参数
        int num=0;
        //循环执行条件
        while (num < 101){
            //结果累加
            sum += num;
            //循环条件变更
            num ++;
        }
        System.out.println (sum);
        int summ=0;
        int numm=0;
        do {
            //结果累加
            summ += numm;
            //循环条件变更
            numm ++;
        }while(numm <= 100);
        System.out.println (summ);
    }
}
