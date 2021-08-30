/*
构造块是定义在一个类中的。
*/

package CodeBlock;
class Person{
    public Person(){
        System.out.println ("【构造方法】Person构造方法执行");
    }
    {
        System.out.println ("【构造块】Person构造块执行");
    }
}
/**
 * @author chaz
 */
public
class ConstructCodeBlock {
    public static void main(String[]args){
        new Person ();
        new Person ();
        new Person ();
    }
}
//构造块会优先于构造方法执行，并且每一次是李华新对象的时候都会调用构造快中的方法