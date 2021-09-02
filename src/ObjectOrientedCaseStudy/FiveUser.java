/*
设计一个表示用户的User类，类中的变量有用户名、口令和记录用户个数的变量，定义累的3个构造方法（无参、为用户名赋值、为用户名和口令赋值）、获取
和设置口令的方法和返回值类信息的方法
在简单java类的定义里面追加有static统计操作即可
 */
package ObjectOrientedCaseStudy;

import java.io.Reader;

class User{
    private String uid;
    private String password;
    private static int count;
    public User(){
        this("NOID","mldn");
    }
    public User(String uid){
        this(uid,"mldn");
    }
    public User(String uid,String password){
        this.uid=uid;
        this.password=password;
        //个数追加
        count ++;
    }
    public static int getCount(){
        //获取用户个数
        return count;
    }
    public String getInfo(){
        return "用户名："+this.uid+"\n密码："+this.password;
    }
}
/**
 * @author Administrator
 */
public
class FiveUser {
    public static void main(String[]args){
        User userA=new User("张三二","123456");
        User userB=new User("张三一","123456");
        User userC=new User("张三五","123456");
        System.out.println(userA.getInfo());
        System.out.println(userB.getInfo());
        System.out.println(userC.getInfo());
        System.out.println("用户个数："+User.getCount());
    }
}
