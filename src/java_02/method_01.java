package java_02;
/*
方法的定义：
public static 返回值类型 方法名称([参数类型 变量，……]){
    该方法要执行的代码块
    [return[返回值];]
}
 */
public
class method_01 {
    public static void main(String[] args){
        //方法调用
        printName ();
        System.out.println (get ( 15 ));
        System.out.println (get ( 5 ));
        smile ( 3 );
    }
    //创建方法
    public static void printName(){
        System.out.println ("*******************");
        System.out.println ("*******王二狗*******");
        System.out.println ("*******************");
    }
    //得到指定数量的外卖
    public static String get(double money){
        if(money>=10.0){
            return "好的给你带一份快餐,还有找零"+(money-10.0)+"元";
        }else {
            return "唉，你给的钱不够啊";
        }
    }
    public static
    void smile( int moneyL){
        //判断满足条件不执行后续代码
        if (moneyL<=0){
            return;
        }
        for (int x=1;x<=moneyL;x++){
            System.out.println ("给爷笑，第"+x+"次");
        }
    }
}
