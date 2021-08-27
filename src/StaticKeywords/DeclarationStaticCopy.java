/*
static是一个关键字，这个关关键字可以用来定义属性和方法
static定义属性
    在一个类中，所有的属性一旦定义了，实际上内容都交由各自的对内存空间保存。
*/
package StaticKeywords;
class PersonFi{
/**
 * 创建所有同一个国家的类
 */
    private String name;
    private int age;
    static String country="中华民国";
    public PersonFi(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getInfo(){
        return "姓名："+this.name+"、 年龄:"+this.age+"、 国家:"+country;
    }
}

/**
 * @author chaz
 */
public
class DeclarationStaticCopy {
    public static void main(String[]args){
//        static属性可以在没有实例化对象的时候使用
        System.out.println (Person.country);
        PersonFi.country="中华人民共和国";
        PersonFi per=new PersonFi ( "张三",22 );
        System.out.println (per.getInfo ());
    }
}