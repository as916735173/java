/*
  this关键字：使用this可以实现以下三类关键字的描述
   ·当前类中的属性：this.属性；
   ·当前类中的方法(普通方法、构造方法)：this()、this.方法名称();
   ·描述当前对象;
  Java程序中的{}是作为一个结构体的边界符号，在程序中进行变量(参数/属性)的时候，以{}为查找边界；
  按照就近取用的原则，如果此时的构造方法并没能够访问类中的属性与参数，在变量前加上一个this表示本类属性查找
 */
package ThisKeywords;


/**
 * @author chaz
 */
/*
class Person{
    private String name;
    private int age;
    public Person(String n,int a){
        name=name;
        age=age;
    }
    public void tell(){
        System.out.println ("姓名："+name+"、 年龄："+age);
    }
}
public
class InvokeClassProperty {
    //主类
    public static void main(String[]args){
        Person pre=new Person ( "王二狗子",38 );
        pre.tell ();
    }
}
结果----姓名：null、 年龄：0
*/
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void tell(){
        System.out.println ("姓名："+this.name+"、 年龄："+this.age);
    }
}
/**
 * @author chaz
 */
public
class InvokeClassProperty {
    //主类
    public static void main(String[]args){
        Person pre=new Person ( "王二狗子",38 );
        pre.tell ();
    }
}