/*
static方法的定义：
    主要特点：可以直接由类名称在没有实例化对象的情况下调用
*/
package StaticKeywords;
class PersonSe{
/**
 * 创建所有同一个国家的类
 */
    private String name;
    private int age;
    private static String country="中华民国";
    public PersonSe(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void setCountry(String c){
        //static方法
//        name=n;-----static方法内部不允许调用非static的属性和方法
        country=c;
    }
    public String getInfo(){
//        setCountry("XXX")-----非static方法内部允许调用static方法和属性
        return "姓名："+this.name+"、 年龄:"+this.age+"、 国家:"+country;
    }
}

/**
 * @author chaz
 */
public
class StaticDefineMethods{
    public static void main(String[]args){
//        static属性可以在没有实例化对象的时候使用
        PersonSe.setCountry("中华人民共和国");
        PersonSe per=new PersonSe ( "张三",22 );
        System.out.println (per.getInfo ());
    }
}
/*
* 此时程序有了两种方法：static方法和非static方法，两个方法此时会有调用限制
* -------1、static方法只允许直接调用static属性和方法，不能直接调用非static方法的属性和方法（如果一定要调用，可以使用对象去调用：new PersonSe.getInfo()）
* -------2、非static方法允许直接调用static方法和属性
* 因为所有的static定义的属性和方法都可以在没有实例化对象的的前提下使用，而所有的非static定义的属性和方法则不可以
* static定的方法和属性都不是代码编写支出所需要开绿的内容，只有在回避实例化对象调用，并且描述公共属性的情况下才会考虑static*/