package java_01;

public
class test_06 {
    public static void main(String[] arg) {
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        int x=200;
        byte num=(byte) x;//int类型为常量会自动转类型，是变量的话需要强制转换
        System.out.println (num);
        System.out.println (max);
        System.out.println (min);
    }
}