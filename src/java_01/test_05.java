package java_01;

public
class test_05 {
    public static
    void main ( String[] args ) {
        //long变量=int变量 来解决数据溢出
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //long变量 + int变量 = long变量，int变量 + int变量 = int变量
        System.out.println ( max );
        System.out.println ( min );
        System.out.println ( "----------------------分割线-------------------------" );
        System.out.println ((long)max + 1 );//使用long强制转换的方式来解决数据溢出
        System.out.println ( max + 2l );
        System.out.println ( min - 1L );
        //使用在后面追加L或者l的方式来处理数据溢出
    }
}
