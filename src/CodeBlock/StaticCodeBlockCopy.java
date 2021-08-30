/*
静态代码块主要指的是使用static关机字定义的代码块，静态块的定义需要考虑到两种情况：
       1、主类中定义静态代码块
       2、非主类中定义静态代码块
 */
//主类中定义静态代码块定义
package CodeBlock;

/**
 * @author chaz
 */
public
class StaticCodeBlockCopy {
    static {
        System.out.println ("*********程序初始化*********");
    }
    public static void main(String[]args){
        System.out.println ("www.baidu.com");
    }
}
//静态代码块会优先与主方法先执行