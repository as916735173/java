package classesObjects;
/*
类与对象的使用和定义
 */
class PersonSe{
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
class ObjectReference {
    public static void main(String[]args){
        //声明并实例化对象
        PersonSe per1=new PersonSe ();
        per1.name="张三";
        per1.age=22;
        //引用传递
        PersonSe per2=per1;
        per2.age=80;
//        方法的调用
        per1.tell ();
    }
}