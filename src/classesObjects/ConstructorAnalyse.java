package classesObjects;


class Message{
    private String title;
    public Message(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){//具有修改功能
        title = t;
    }
}
class PersonTe {
    private String name;
    private int age;
    public PersonTe(Message msg,int a){
        name= msg.getTitle ();
        age=a;
    }
    public Message getInfo(){
        return new Message (name+":"+age);
    }
    public void tell () {
        System.out.println ( "姓名：" + name + "、 年龄：" + age );
    }
}
/**
 * @author chaz
 */
public
class ConstructorAnalyse{
    public static
    void main ( String[] args ) {
        //匿名对象：此对象没有任何的引用，使用一次后会成为垃圾被GC回收
        Message msg=new Message ("mldn");
       PersonTe per=new PersonTe (msg,20);
       msg=per.getInfo ();
       System.out.println (msg.getTitle ());
    }
}