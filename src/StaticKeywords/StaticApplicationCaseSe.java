package StaticKeywords;

/**
 * 实现属性的自动命名处理：
 *  ·如果现在传递到了title属性，就是用传递的属性内容，如果没有传递title属性，则自动采用“NOTITLE-编号”的形式进行概述性内容的定义
 * @author Administrator
 */
class BookFi{
    private String title;
    private static int count=0;
    public BookFi(){
        this("NOTITLE-"+count++);
    }
    public BookFi(String title){
        this.title=title;
        /*count ++;
        System.out.println("第 "+count+" 本新的图书被创建出来。");*/
    }
    public String getTitle(){
        return this.title;
    }
}

/**
 * @author Administrator
 */
public class StaticApplicationCaseSe {
    public static void main(String[]args){
        System.out.println(new BookFi("java").getTitle());
        System.out.println(new BookFi("python").getTitle());
        System.out.println(new BookFi("C++").getTitle());
        System.out.println(new BookFi().getTitle());
        System.out.println(new BookFi().getTitle());
    }
}
//这样处理设置的好处是可以避免在没有设置title属性地内容为null的重复问题