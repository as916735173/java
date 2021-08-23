package java_02;
/*
方法的重载：同一个方法名但是可以根据调用时传递的不同参数的类型或个数实现不容方法提的调用，
实现了方法的重载
***防火阀的重载和方法的返回值类型没有关系，只和参数有关系，只要是重载，建议和返回值类型一致
 */
public
class method_02 {
    public static void main(String[] args){
        System.out.println (sum ( 22,33 ));
        System.out.println (sum ( 22,33 ,19));
        System.out.println  (sum ( 22.70,33.60 ));
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }
    public static double sum(double x,double y){
        return x+y;
    }
}
    

