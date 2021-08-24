package classesObjects;
/*
类与对象的使用和定义
 */
class Persons{
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
class ClassDefineSe {
    public static void main(String[]args){
        //声明对象
        Persons per=null;
        //实例化对象
        per=new Persons ();
        per.name="李四";
        per.age=99;
//        方法的调用
        per.tell ();
    }
}