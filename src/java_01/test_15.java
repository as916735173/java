package java_01;
//if分支结构
public
class test_15 {
    public static void main(String[] args){
        int age=22;
        if (age>=18 && age <= 20) {
            System.out.println ( "光荣参军" );
        }
        else {
            System.out.println ( "回归平凡" );
        }
        int score=56;
        if(score>=85&&score<=100){
            System.out.println ("优等生");
        }
        else if (score>=60&&score<85){
            System.out.println ("及格生");
        }
        else{
            System.out.println ("不及格");
        }
    }
}
