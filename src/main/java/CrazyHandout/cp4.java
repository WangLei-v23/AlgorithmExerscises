package CrazyHandout;

/**
 * @ClassName: cp4
 * @Description: java疯狂讲义第4章习题
 * @Author: WangLei
 * @Date: 2020/12/2 23:37
 */
public class cp4 {

    /**
     * @Author: WangLei
     * @Description:  九九乘法表
     * @Date: 23:40 2020/12/2
     * @Param: []
     * @return: void
     **/
    public static void cp4T1(){
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+" ");
            }
            System.out.println();
        }
    }

    /**
     * @Author: WangLei
     * @Description:  循环输出等腰三角形
     * @Date: 23:41 2020/12/2
     * @Param: []
     * @return: void
     **/
    public static void cp4T2(int layer){
        for (int i=0;i<layer;i++){
            for (int j=layer-i-1;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    /**
     * @Author: WangLei
     * @Description:  利用math类方法打印近似圆，大小随半径变化
     * @Date: 23:41 2020/12/2
     * @Param: []
     * @return: void
     **/
    public static void cp4T3(int r){

    }

    /**
     * @Author: WangLei
     * @Description: 按字节截取字符串 英文为1个字节 中文为两个字节
     * @Date: 23:42 2020/12/2
     * @Param: []
     * @return: void
     **/
    public static void cp4T4(){

    }

    /**
     * @Author: WangLei
     * @Description:  浮点数转换为人民币读法字符串 1066.333=壹仟零陆元叁角叁分
     * @Date: 23:43 2020/12/2
     * @Param: []
     * @return: void
     **/
    public static void cp4T5(){

    }

    /**
     * @Author: WangLei
     * @Description:  控制台五子棋游戏
     * @Date: 23:43 2020/12/2
     * @Param: []
     * @return: void
     **/
    public static void cp4T6(){

    }

    public static void main(String[] args) {

//        cp4T1();
        cp4T2(4);
//        cp4T3(5);
//        cp4T4();
//        cp4T5();
//        cp4T6();

    }
}
