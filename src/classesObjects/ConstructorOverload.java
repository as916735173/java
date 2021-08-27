package classesObjects;
/**
 * @author chaz
 * 构造方法与匿名对象
 * 构造方法重载
 * 构造方法可以惊醒数据的设置，setter也可以进行数据的设置
 * ----构造方法是在对像实例化的时候为属性设置初始化内容
 * ----setter除了可以设置数据，还可以修改数据
 */
class PersonSi {
    private String name;
    private int age;
    /**
     * 无参--一参--二参
    */
    public PersonSi(){
        //赋予默认值
        name="张二狗";
        age=100;
    }
    public PersonSi(String n){
        name=n;
    }
    public void tell () {
        System.out.println ( "姓名：" + name + "、 年龄：" + age );
    }
    //方法名称必须与类名称保持一致
    public PersonSi(String n,int a){
        //定义有参构造
        //为类中的属性赋值（初始化）
        name=n;
        age=a;
    }
}

/**
 * @author chaz
 */
public
class ConstructorOverload {
    public static
    void main ( String[] args ) {
        //1、对象的初始化准备。2、
        //声明并实例化对象
        PersonSi per = new PersonSi ();
    /*//在类外部修改属性
    per.name="狗蛋";
    per.age=-56;*/
        //使用方法
        /*per.setName ( "张三" );
        per.setAge ( 28 );*/
        //2、对象的使用
        //方法调用
        per.tell ();
    }
}