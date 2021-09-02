/*
声明一个图书类，其数据成员为书名、编号（利用静态变量实现自动编号）、书价、并拥有静态数据成员册数，记录图书的总册数，在构造方法中利用此静态变量为对象
的编号赋值，在主方法中定义多个对象，并求出总册数。
 */
package ObjectOrientedCaseStudy;
class Book{
    private int bid;
    private String title;
    private double price;
    private static int count=0;
    public Book(String title,double price){
        this.bid=count+1;
        this.title=title;
        this.price=price;
        count++;
    }
    public String getInfo(){
        return "图书编号："+this.bid+"\n名称："+this.title + "\n价格："+this.price;
    }
    public static int getCount(){
        return count;
    }
}
/**
 * @author Administrator
 */
public class SixBook {
    public static void main(String[] args){
        Book bookA=new Book("JAVA",57.5);
        Book bookB=new Book("C++",55.0);
        Book bookC=new Book("python",67);
        System.out.println(bookA.getInfo());
        System.out.println(bookB.getInfo());
        System.out.println(bookC.getInfo());
        System.out.println("图书总册数："+Book.getCount());
    }
}
//在面向对象最基础的开发里面，简单Java类是解决先期设计最好的方案。