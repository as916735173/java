/*
  1、构造方法方法调用(this.方法名())优化
    ·构造方法必须在实例化新对象的事后调用，所以this()的语句只允许放在构造方法的首行
    ·构造方法互相调用时请保留有程序出口，避免死循环
 */
package ThisKeywords;



class PersonSe{
    private String name;
    private int age;
    public PersonSe(){
        System.out.println ("-------SB---------");
    }
    public PersonSe(String name){
        //调用本类无参构造
        this();
        this.name=name;
    }
    public PersonSe(String name,int age){
        //调用单参构造
        this(name);
        this.age=age;
        /*加和不加都表示本类方法
        this.setName ( name );
        setAge ( age );*/
    }
    public void tell(){
        System.out.println ("姓名："+this.name+"、 年龄："+this.age);
    }
}

/**
 * @author chaz
 */
public
class MethodOptimize {
    //主类
    public static void main(String[]args){
        PersonSe pre=new PersonSe ( "王二狗子",38 );
        pre.tell ();
    }
}