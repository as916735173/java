package classesObjects;
/*
类与对象的使用和定义
 */
class Person{
    String name;
    int age;
    public void tell(){
        System.out.println ("姓名："+name+"、 年龄："+age);
    }
}
/**
 * @author chaz
 */
public
class ClassDefine {
    public static void main(String[]args){
        //声明并实例化对象
        Person per=new Person ();
        per.name="张三";
        per.age=22;
//        方法的调用
        per.tell ();
    }
}