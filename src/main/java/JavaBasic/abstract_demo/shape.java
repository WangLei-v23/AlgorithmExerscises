package JavaBasic.abstract_demo;

/**
 * @ClassName: shape
 * @Description:抽象类  形状
 * @Author: WangLei
 * @Date: 2021/1/26 10:57
 */
public abstract class  shape {
    private String color;

    //计算周长的抽象方法
    public abstract int celPerimeter();
    //返回形状的抽象方法
    public abstract String getType();


    {
        color="black";
        System.out.println("执行初始化块:color="+color);
    }
    public shape (){
        System.out.println("执行shape无参构造器");
    }
    public shape(String color){
        System.out.println("执行shape有参构造器");
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
