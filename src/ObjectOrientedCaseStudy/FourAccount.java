/*
构造一个银行账户类，类的构成包括以下内容：
    1、数据成员用户的账户名称、用户的账户余额（private数据类型）。
    2、方法包括开户（设置账户名称及余额），利用构造方法完成。
    3、查询余额
 */
package ObjectOrientedCaseStudy;
class Account{
    private String name;
    private double balance;
    public Account(){}
    public Account(String name){
        //调用双参构造
        this(name,0.0);
    }
    public Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getInfo(){
        return "账户名称："+this.name+"\n账户余额"+this.balance;
    }
}
/**
 * @author chaz
 */
public
class FourAccount {
    public static void main(String[]args){
        Account account=new Account ("二狗子",1000000);
        System.out.println (account.getInfo ());
        System.out.println (account.getBalance ());
    }
}
