package JavaBasic;

/**
 * @ClassName: finaltest
 * @Description:
 * @Author: WangLei
 * @Date: 2021/1/14 20:58
 */
public class finaltest {
    public static void main(String[] args) {
        final String book1="abc"+123;//即使包含隐式转换，仍然可被视为宏变量
        final String book2="abc"+String.valueOf(123);//带函数的处理，无法在编译期确定为宏变量
        System.out.println(book1=="abc123");
        System.out.println(book2=="abc123");
    }
}

class finaly{
    final String str;
    final int c;
    final static double d;
    {//初始化块中对成员变量初始化

//        System.out.println(str); //此处str未初始化就进行访问，因此报错
        str="finaltets";
    }

    static {//静态初始化块中初始化
        d=5.6;
    }

    public finaly(){//构造器中初始化
        c=0;
    }
}
