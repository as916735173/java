package StaticKeywords;

/**
 * 编写写一个类，可以实现实例化对象个数统计的类，每一次创建新的实例化对象都可以实现一个统计操作。
 *     ·此时单独创建一个static属性，因为所有对象都共享一个static属性，name在构造方法中可以实现数据的统计处理
 * @author Administrator
 */
class Book{
    private String title;
    private static int count=0;
    public Book(String title){
        this.title=title;
        count ++;
        System.out.println("第 "+count+" 本新的图书被创建出来。");
    }
}
/**
 * @author Administrator
 */
public class StaticApplicationCase {
    public static void main(String[]args){
        new Book("java");
        new Book("python");
        new Book("C++");
    }
}
