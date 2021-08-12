package java_01;
public
class test_03 {
    public static
    void main ( String[] args ) {
        int max=Integer.MAX_VALUE;//获取int的最大可赋予值
        int min=Integer.MIN_VALUE;//获取int的最小可赋予值
        System.out.println (max);//2147483647
        System.out.println (min);//-2147483648
        System.out.println ("----------------------分割线-------------------------");
        System.out.println (max+1);//-2147483648
        System.out.println (max+2);//-2147483647
        System.out.println (min-1);//2147483647
        //java种超过数据最大值出现的数据循环称为数据溢出
    }
}
