package classesObjects;
/**
 * @author chaz
 * 构造方法与匿名对象
 * 构造方法重载
 * 构造方法可以惊醒数据的设置，setter也可以进行数据的设置
 * ----构造方法是在对像实例化的时候为属性设置初始化内容
 * ----setter除了可以设置数据，还可以修改数据
 */
class PersonEi {
    private String name;
    private int age;
    public void tell () {
        System.out.println ( "姓名：" + name + "、 年龄：" + age );
    }
    //方法名称必须与类名称保持一致
    public PersonEi(String n,int a){
        //定义有参构造
        //为类中的属性赋值（初始化）
        name=n;
        age=a;
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
class ConstructorOverloadCoTo{
    public static
    void main ( String[] args ) {
        //匿名对象：此对象没有任何的引用，使用一次后会成为垃圾被GC回收
       new PersonEi ("张三",19).tell ();
    }
}