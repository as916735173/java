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
public
class classDefine {
    public static void main(String[]args){
        //声明并实例化对象
        Person per=new Person ();
        per.name="张三";
        per.age=22;
        per.tell ();
    }
}