/*
static是一个关键字，这个关关键字可以用来定义属性和方法
static定义属性
    在一个类中，所有的属性一旦定义了，实际上内容都交由各自的对内存空间保存。
*/
package StaticKeywords;
class Person{
/**
 * 创建所有同一个国家的类
 */
    private String name;
    private int age;
    /**
     * 国家——暂时不封装
     */
    /*String country="中华民国";*/
//            追加static成为公共属性---第18行和43行代码
    static String country="中华民国";
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getInfo(){
        return "姓名："+this.name+"、 年龄:"+this.age+"、 国家:"+this.country;
    }
}
/**
 * @author chaz
 */
public
class DeclarationStaticAttributes {
    public static void main(String[]args){
        //以下代码出现了重复保存
        /*Person preA=new Person ( "张三",10 );
        Person preB=new Person ( "李四",22 );
        Person preC=new Person ( "王二",33 );
        System.out.println (preA.getInfo ());
        System.out.println (preB.getInfo ());
        System.out.println (preC.getInfo ());*/
        Person preA=new Person ( "张三",10 );
        Person preB=new Person ( "李四",22 );
        Person preC=new Person ( "王二",33 );
        //修改一个属性，所有对象的属性都发生改变
        /*preA.country="中华人民共和国";*/
        Person.country="中华人民共和国";
        System.out.println (preA.getInfo ());
        System.out.println (preB.getInfo ());
        System.out.println (preC.getInfo ());
    }
}
/*
对于static属性的访问需要注意一点：
    1、由于其本身是一个公共的属性，虽然可以通过对象进行访问，但是最好应该通过所有对象的最高代表(类)来进行访问
    ————所以static属性可以由类名称直接调用:第45行代码
    2、static属性虽然定义在类中，但是其并不受到类实例化队形的控制
    ————static属性可以在没有实例化对象的时候使用
 */
