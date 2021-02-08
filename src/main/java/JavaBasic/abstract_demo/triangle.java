package JavaBasic.abstract_demo;

/**
 * @ClassName: triangle
 * @Description:继承抽象类的子类  三角
 * @Author: WangLei
 * @Date: 2021/1/26 11:16
 */
public class triangle extends shape{

    private int a;
    private int b;
    private int c;

    @Override
    public int celPerimeter() {
        return a+b+c;
    }

    @Override
    public String getType() {
        return "triangle";
    }

    public triangle(){
        System.out.println("执行triangle无参构造器");
    }
    public triangle(String color,int a,int b,int c){
        super(color);
        this.setTriangle(a,b,c);
        System.out.println("执行triangle有参构造器，继承shape的color和get/set方法");
    }

    public void setTriangle(int a,int b,int c){
        if (a+b>c&&a+c>b&&b+c>a){
            this.a=a;
            this.b=b;
            this.c=c;
        }else{
            System.out.println("三角形两边之和必须大于第三边！");
            return;
        }
    }


    public static void main(String[] args) {
        triangle triangle = new triangle("red", 3, 3, 3);
        System.out.println("周长为"+triangle.celPerimeter()+"的"+triangle.getColor()+"-"+triangle.getType());

    }
}
