//定义并测试一个代表员工的Employee类。员工属性包括”编号“、”姓名“、”基本薪水“、”薪水增长率“，还包括计算薪水增长及计算增长后的工资总额的操作方法。
//这个程序的功能已经超过了简单java类的定义范畴，因为简单java类里面不需要涉及到复杂的计算逻辑
package ObjectOrientedCaseStudy;
class Employee{
    private long empno;
    private String ename;
    private double salary;
    private double rate;
    public Employee(){}
    public Employee(long empno,String ename,double salary,double rate){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
        this.rate=rate;
    }
    public double salaryIncValue(){
        //得到薪水增长额度
        return this.salary*this.rate;
    }
    public double salaryIncResult(){
        this.salary=this.salary*(1+this.rate);
        return this.salary;
    }
    public String getInfo(){
        return "雇员编号:"+this.empno+" 雇员姓名:"+this.ename+" 基本工资："+this.salary+" 工资增长率"+this.rate;
    }
}
/**
 * @author chaz
 */
public
class SecondEmployee {
    public static void main(String[]args){
        Employee emp=new Employee (7369L,"狗蛋",3000,0.3);
        System.out.println (emp.getInfo ());
        System.out.println ("工资调整额度："+emp.salaryIncValue ());
        System.out.println ("工资调整结果："+emp.salaryIncResult ());
        System.out.println (emp.getInfo ());
    }
}
