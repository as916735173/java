package java_01;


public
class test_12 {
    public static void main(String[] args){
        int result=123456*987654+100*22;
        System.out.println (result);
        int result_1=10;
        result_1=result_1+9990;
        //result_1+=9990,和上面的一个效果
        System.out.println (result_1);
        int x=10;
        int y=15;
        int a=++x;
        System.out.println (a);
        int b=--x;
        System.out.println (b);
        int c=y++;
        System.out.println (c);
        int d=y--;
        System.out.println (d);
        int u=10;
        int v=20;
        /*
        int jie_guo=10 + ++u;
        int jie_guo_1=v++ + 10;
        System.out.println (jie_guo);//21
        System.out.println (jie_guo_1);//30
        */
        int jie_guo_2=++u - v--;
        System.out.println (jie_guo_2);
        System.out.println (u);
        System.out.println (v);
    }
}
