package java_01;

public
class test_04 {
    public static
    void main ( String[] args ) {
        //long变量=int变量 来解决数据溢出
        long max = Integer.MAX_VALUE;
        long min = Integer.MIN_VALUE;
        System.out.println ( max );
        System.out.println ( min );
        System.out.println ( "----------------------分割线-------------------------" );
        System.out.println ( max + 1 );
        System.out.println ( max + 2 );
        System.out.println ( min - 1 );
    }
}
