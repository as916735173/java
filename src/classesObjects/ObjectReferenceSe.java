package classesObjects;
/*
类与对象的使用和定义
 */
class PersonTh{
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
class ObjectReferenceSe {
    public static void main(String[]args){
        //声明并实例化对象
        PersonTh per=new PersonTh ();
        per.name="张三";
        per.age=22;
        //等价于:PersonTh temp=per;
        change ( per );
        //方法的调用
        per.tell ();
    }
    public static void change(PersonTh temp){
        temp.age=80;
    }
}