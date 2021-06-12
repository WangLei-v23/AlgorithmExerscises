package SouthWind.s013;

public class Express {
    private  int ExpressId;

    public Express(int expressId) {
        ExpressId = expressId;
    }

    public int getExpressId() {
        return ExpressId;
    }

    public void setExpressId(int expressId) {
        ExpressId = expressId;
    }

    public void get(){
        System.out.println("开始取第"+this.ExpressId+"个快递");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第" + this.ExpressId + "个快递完成取货");
    }
}
