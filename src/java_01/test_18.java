package java_01;
//for循环：明确循环次数用for，明确循环结果用while
/*
for（定义循环的初始化值;循环判断;修改循环数据）{
    循环语句的执行;
}
 */
public
class test_18 {
    public static void main(String[] args){
        //for循环1-100的累加
        int sum=0;
        for (int num=1;num<=100;num++){
            sum+=num;
        }
        System.out.println (sum);
    }
}
