package java_01;

public
class test_11 {
    public static void main(String[] arg){
        String str = "Hello " ;
        str = str + "World !" ;
        System.out.println (str);
        double x=10.1;
        float y=2;
        String str_01="计算结果："+(x+y);//字符串优先级最高
        System.out.println (str_01);
        System.out.println ("\tHello World !!! \nHello World \\!!!");//tab(\t)、"(\")、换行（\n）————转义字符
    }
}
