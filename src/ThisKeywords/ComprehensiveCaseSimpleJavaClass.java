package ThisKeywords;

/**
 * @author chaz
 */
/*
简单Java类是指可以描述某一类信息的程序：描述一个人、一本书等等，在类中并不会有很复杂的逻辑操作，只作为一种信息存储的媒介
————核心结构：
    1、类名称一定要有意义，可以明确地描述某一类事物
    2、类中的所有属性都必须要使用private进行封装，同时封装后属性必须要提供有setter、getter方法
    3、类中可一提供有无数多个构造方法，但是必须保留有无参构造方法
    4、类之中不允许出现任何输出语句，所有内容的获取必须返回
    5、【非必须】可以提供有一个获取对象详细信息的方法，暂时将此方法名称定义为getInfo()方法
 */

/*
定义一个简单Java类
*/
class Dept{
//    类名称可以明确描述出某类事务
    private long deptno;
    private String dname;
    private String loc;
//    必须提供有无参
    public Dept(){}
    public Dept(long deptno,String dname,String loc){
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }
    public String getInfo(){
        return "【部门信息】部门编号："+this.deptno+"、部门名称："+this.dname+"部门位置"+this.loc;
    }
    public void setDeptno(long deptno){
        this.deptno=deptno;
    }
    public void setDname(String dname){
        this.dname=dname;
    }
    public void setLoc(String loc){
        this.loc=loc;
    }
    public long getDeptno(){
        return this.deptno;
    }
    public String getDname(){
        return this.dname;
    }
    public String getLoc(){
        return this.loc;
    }
}
/**
 * @author chaz
 */
public
class ComprehensiveCaseSimpleJavaClass {
    public static void main(String[]args){
        Dept dept=new Dept (10,"技术部","北京");
    }
}
//以上包函数剧类型划分、类的定义、private封装、构造方法、方法定义、对象实例化等等