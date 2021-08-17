package java_01;
//循环嵌套:九九乘法表
/*

 */
public
class test_20 {
    public static void main(String[] args){
        //打印九九乘法表
        //控制乘法表高度
        for (int x=1;x<=9;x++){
            //控制乘法表宽度：y<=x去除重复结果
            for (int y=1;y<=x;y++){
                System.out.print (y+"*"+x+"="+(x*y)+"\t");
            }
            System.out.println ();
        }
    }
}