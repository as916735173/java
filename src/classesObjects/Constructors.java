package classesObjects;
/**
 * @author chaz
 * 构造方法与匿名对象
 */
class PersonFr {
    private String name;
    private int age;

    public
    void tell () {
        System.out.println ( "姓名：" + name + "、 年龄：" + age );
    }

    //设置姓名属性
    public
    void setName ( String n ) {
        name = n;
    }

    //设置年龄属性
    public
    void setAge ( int a ) {
        //age=a;
        //限制输入数字，不满足返回0
        if (a >= 0) {
            age = a;
        }
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
    public
    class Constructors {
        public static
        void main ( String[] args ) {
            //声明并实例化对象
            PersonFr per = new PersonFr ();
        /*//在类外部修改属性
        per.name="狗蛋";
        per.age=-56;*/
            //使用方法
            per.setName ( "张三" );
            per.setAge ( 28 );
            //方法调用
            per.tell ();
        }
    }