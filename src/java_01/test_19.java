package java_01;
//循环控制：continue，break
/*
continue：执行到的时候，当前语句后续代码不执行，跳过执行下一个条件，
 */
public
class test_19 {
    public static void main(String[] args){
        for (int x=0;x<=10;x++){
            if (x==11) {
            break;
        }
        System.out.print (x+"、");
        }
        System.out.println ();
        for (int y=0;y<=10;y++){
            if (y==3){
                continue;
            }
            System.out.print ( y+"、" );
        }
        System.out.println ();
        point:for (int z=0;z<=10;z++){
            for (int u=0;u<=2;u++){
                if (z==u){
                    //循环结束返回point判断继续执行
                    continue point;
                }
                System.out.print(z+"、");
            }
            System.out.println ();
        }
    }
}