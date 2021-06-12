package SouthWind.s012;

public class Car {
    private int light;
    private int wheel;
    private String start;
    private MyException exception;

    public Car(int light, int wheel, String start) {
        if (light==2&&wheel==4&&"start".equals(start)){
            this.light = light;
            this.wheel = wheel;
            this.start = start;
            System.out.println("车辆正常启动！");
        }else {
            this.exception=new MyException("请输入正确的启动参数！");
            throw this.exception;
        }



    }
}
