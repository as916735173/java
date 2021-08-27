/*
  this关键字：使用this可以实现以下三类关键字的描述
   ·当前类中的属性：this.属性；
   ·当前类中的方法(普通方法、构造方法)：this()、this.方法名称();
   ·描述当前对象;
   1、构造方法调用(this()):使用关键字new实例化对象的时候才会调用构造方法；
   2、普通方法调用(this.方法名())：实例化对象产生之后就可以调用普通方法
 */
package ThisKeywords;



class PersonFi{
    private String name;
    private int age;
    public PersonFi(String name,int age){
        //加和不加都表示本类方法
        this.setName ( name );
        setAge ( age );
    }
    public void tell(){
        System.out.println ("姓名："+this.name+"、 年龄："+this.age);
    }
    //普通方法调用
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

/**
 * @author chaz
 */
public
class InvokeClassMethod {
    //主类
    public static void main(String[]args){
        PersonFi pre=new PersonFi ( "王二狗子",38 );
        pre.tell ();
    }
}