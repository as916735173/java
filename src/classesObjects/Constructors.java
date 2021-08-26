package classesObjects;
/**
 * @author chaz
 * 构造方法与匿名对象
 *   ·声明并实例化对象，这个时候实例化对象中的属性并没有任何的数据存在
 *   ·需要通过一系列的setter方法为类中的属性设置内容
 *   ·重复setter方法使用时，可以通过构造方法实现实例化对象中的属性初始化处理，在关键字new时使用
 * Java程序里的构造方法定义：
 *      1.构造方法名称必须与类名称保持一致
 *      2、构造方法不允许设置任何的返回值类型---即：没有返回值
 *      3、构造方法是在使用关键字new实例化对象的时候自动调用的
 */
class PersonFr {
    private String name;
    private int age;
    public void tell () {
        System.out.println ( "姓名：" + name + "、 年龄：" + age );
    }
    //方法名称必须与类名称保持一致
    public PersonFr(String n,int a){
        //定义有参构造
        //为类中的属性赋值（初始化）
        name=n;
        age=a;
    }
    //设置姓名属性
    public
    void setName ( String n ) {
        name = n;
    }
    //设置年龄属性
    public
    void setAge ( int a ) {
        age=a;
        //限制输入数字，不满足返回0
        /*if (a >= 0) {
            age = a;
        }*/
    }
    //获取姓名属性
    public
    String getName () {
        return name;
    }
    //获取年龄属性
    public
    int getAge () {
        return age;
    }
}
    /**
     * @author chaz
     */
    public
    class Constructors {
        public static
        void main ( String[] args ) {
            //1、对象的初始化准备。2、
            //声明并实例化对象
            PersonFr per = new PersonFr ("张三",18);
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