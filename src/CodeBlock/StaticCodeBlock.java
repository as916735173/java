/*
静态代码块主要指的是使用static关机字定义的代码块，静态块的定义需要考虑到两种情况：
       1、主类中定义静态代码块
       2、非主类中定义静态代码块
 */
//非主类中定义静态代码块定义
package CodeBlock;
class Message{
    public static String getCountry(){
        //该消息的内容可能来自与网络或其他服务器
        return "中华人民共和国";
    }
}
class PersonSe{
    /*public PersonSe(){
        System.out.println ("【构造方法】Person构造方法执行");
    }
    static {
        System.out.println ("【静态块】静态块执行");
    }
    {
        System.out.println ("【构造块】Person构造块执行");
    }*/
    private static String country;
    static {
        //可能有很多语句要执行的时候，使用静态代码块
        //编写一部分代码
        country=Message.getCountry ();
        System.out.println (country);
    }
}
/**
 * @author chaz
 */
public
class StaticCodeBlock {
    public static void main(String[]args){
        new PersonSe ();
    }
}
//静态代码块会优先与构造块执行，且不管有多少个实例化对象出现静态代码块只会执行一次，静态代码块的主要目的是为了类中的静态属性初始化(非注释部分)