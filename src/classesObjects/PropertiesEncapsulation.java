package classesObjects;

/**
 * @author chaz
 * 成员属性封装：·没有进行封装处理，外部可以传入错误数据。此时就引入了封装属性概念来解决
 *            ·可以利用private关键字进行封装处理
 *            ·封装后对外部不可见，对类的内不时可见的
 *            ·设置或者取得属性：setxxx()、getxxx()方法
 *                  --例子：
 *                      ·设置属性：public void setName(String n);
 *                      `获取属性：public String getName();
 */
class PersonFo{
    private String name;
    private int age;
    public void tell(){
        System.out.println ("姓名："+name+"、 年龄："+age);
    }
    //设置姓名属性
    public void setName(String n){
        name=n;
    }
    //设置年龄属性
    public void setAge(int a){
        //age=a;
        //限制输入数字，不满足返回0
        if(a>=0) {
            age = a;
        }
    }
    //获取姓名属性
    public String getName(){
        return name;
    }
    //获取年龄属性
    public int getAge(){
        return age;
    }
}
//主类
public
class PropertiesEncapsulation {
    public static void main(String[]args){
        //声明并实例化对象
        PersonFo per=new PersonFo ();
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
