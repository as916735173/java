package ThisKeywords;
/*
构造方法相互调用案例：
    要求定义一个描述有员工信息的程序类，该类中提供有：编号、姓名、部门、工资，提供四个构造方法
        ·【无参构造】编号定义为1000，姓名定义为无名氏；
        ·【单参构造】传递编号，姓名定义为“新员工”，部门定义为“未定”，工资为0.0
        ·【三参构造】传递编号、姓名、部门定，工资为2500.00
        ·【四参构造】所有属性进行全部传递。
*/

/**
 * @author chaz
 */
class Emp{
    //注释代码为优化前
    //员工编号
    private long empno;
    //员工姓名
    private String ename;
    //部门名称
    private String dept;
//    基本工资
    private double salary;
    public Emp(){
        this(1000,"无名氏",null,0.00);
        /*this.salary=1000;
        this.ename="无名氏";*/
    }
    public Emp(long empno){
        this(1000,"新员工",null,0.00);
        /*this.empno=empno;
        this.ename="新员工";
        this.dept="未定";*/
    }
    public Emp(long empno,String ename,String dept){
        this(empno,ename,dept,2500.00);
        /*this.empno=empno;
        this.ename=ename;
        this.dept=dept;*/
    }
    public Emp(long empno,String ename,String dept,double salary){
        this.empno=empno;
        this.ename=ename;
        this.dept=dept;
        this.salary=salary;
    }
    public String getInfo(){
        return "雇员编号："+this.empno+
                "\n雇员姓名："+this.ename+
                "\n所在部门："+this.dept+
                "\n基本工资："+this.salary;
    }
}
public
class ConstructorsEachOther {
    public static void main(String[]args){
//        Emp emp=new Emp (751L,"辣鸡","技术部",1999.00);
        Emp emp=new Emp (751L,"辣鸡","技术部");
        System.out.println (emp.getInfo ());
    }
}
