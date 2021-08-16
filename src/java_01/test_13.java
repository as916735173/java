package java_01;
//关系运算符：>,<,>=,<=,!=,==

public
class test_13 {
    public static void main(String[] args){
        int x=20;
        int y=22;
        //比较x和y的大小输出最大值
        //三目运算
        int max=x>y?x:y;
        /*
        int max=0;
        if (x>y){
        max=x;
        }
        else{
        max=y
        }
         */
        //嵌套：int max=x>y?(x>z?x:z):(y>z?y:z)test_13
        System.out.println (max);
    }
}
