package java_01;
/**
 * @author Administrator
 */
public
class test_11 {
    public static void main(String[] arg){
        String str = "Hello " ;
        str = str + "World !" ;
        System.out.println (str);
        double x=10.1;
        float y=2;
        //字符串优先级最高
        String str01 ="计算结果："+(x+y);
        System.out.println (str01);
        //tab(\t)、"(\")、换行（\n）————转义字符
        System.out.println ("\tHello World !!! \nHello World \\!!!");
    }
}
