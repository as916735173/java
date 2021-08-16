package java_01;
//switch语句：
/*
switch(数据){
    case（数值）:{
    数值满足时执行语句;
    [break];
    }
    case（数值）:
    数值满足时执行语句;
    [break];
    }
    default:{
    数值满足时执行语句;
    [break];
    }
}
 */
public
class test_16 {
    public static void main(String[] args){
        int age=16;
        switch (age){
            case 15:{
                System.out.println ("未成年");
                break;
            }
            case 18:{
                System.out.println ("已成年");
                break;
            }
            default:{
                System.out.println ("条件未满足");
                break;
            }
        }
        String str="hello" ;
        switch (str){
            case "Hello":{
                System.out.println ("Hello");
                break;
            }
            case "hello":{
                System.out.println ("hello");
                break;
            }
            default:{
                System.out.println ("没有匹配上");
                break;
            }
        }
    }
}
