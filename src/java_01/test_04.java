package java_01;

public
class test_04 {
    public static
    void main ( String[] args ) {
        long max = Integer.MAX_VALUE;//获取int的最大可赋予值
        long min = Integer.MIN_VALUE;//获取int的最小可赋予值
        System.out.println ( max );//2147483647
        System.out.println ( min );//-2147483648
        System.out.println ( "----------------------分割线-------------------------" );
        System.out.println ( max + 1 );
        System.out.println ( max + 2 );
        System.out.println ( min - 1 );
    }
}
