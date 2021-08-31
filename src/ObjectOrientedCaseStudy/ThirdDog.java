/*
设计一个dog类，有名字、颜色、年龄等属性，定义构造方法来初始化类的这些属性，定义方法输出Dog信息，编写应用程序使用Dog类
 */
package ObjectOrientedCaseStudy;
class Dog{
    private String name;
    private String color;
    private int age;
    public Dog(){}
    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public String getInfo(){
        return "狗的名字:"+this.name+"\n狗的颜色:"+this.color+"\n狗的年龄:"+this.age;
    }
}
/**
 * @author chaz
 */
public
class ThirdDog {
    public static void main(String[]args){
        Dog dog=new Dog ("二黑","black",10);
        System.out.println (dog.getInfo ());
    }
}
//典型的简单java类