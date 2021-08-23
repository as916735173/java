package java_02;
/*
方法递归调用：可以解决重复且麻烦的程序
    ·一定要设置地柜调用的结束条件
    ·每一次调用必须要修改传递的参数条件
 */
public
class method_03 {
    public static void main(String[] args){
       System.out.println (sum ( 100 ));
       System.out.println (summ ( 90 ));
    }
    public static int sum(int num){
        //累加结束条件
        if (num==1){
            return 1;
        }
        //执行累加
        return num+sum ( num-1 );
    }
    //阶乘求和
    public static double summ(int numm){
        if (numm==1){
            return 1;
        }
        return factorial ( numm )+summ ( numm-1 );
    }
    public static double factorial(int numm){
        if (numm==1){
            return 1;
        }
        return numm*factorial ( numm-1 );
    }
}
    

