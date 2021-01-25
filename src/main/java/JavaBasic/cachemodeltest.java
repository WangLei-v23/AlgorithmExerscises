package JavaBasic;

/**
 * @ClassName: cachemodeltest
 * @Description: 缓存模式实例
 * @Author: WangLei
 * @Date: 2021/1/22 10:22
 */
public class cachemodeltest {

    //使用数组缓存实例  size  cachemodeltest[]
    private static int MAX_SIZE=10;
    private static cachemodeltest[] cache=new cachemodeltest[MAX_SIZE];

    //记录实例在缓存中的位置   pos-1为最新实例在缓存中的位置
    private static int pos=0;

    //类属性
    private final String name;

    //构造方法  为final修饰的成员变量进行初始化
    private cachemodeltest(String name){
        this.name=name;
    }

    //getName
    public String getName(){
        return name;
    }
    //遍历缓存对象的方法
    private static cachemodeltest valueOf(String name){
        //遍历已经缓存的对象  如果已有对象 直接返回该实例 （需要重写equals）
        for (int i=0;i<MAX_SIZE;i++){
            if (cache[i]!=null&&cache[i].getName().equals(name)){
                return cache[i];
            }
        }
        //若缓存池已满 则覆盖第一个缓存的对象
        if (pos==MAX_SIZE){
            cache[0]=new cachemodeltest(name);
            pos=1;
            return cache[0];
        }else{//缓存池未满且无该对象 则创建对应实例 添加至缓存尾部
            cache[pos++]=new cachemodeltest(name);
        }

        return cache[pos-1];
    }
    //重写equals
    public boolean equals(Object obj){
        //如果引用指向同一个对象 ==返回true
        //（基本类型使用==进行比较，jvm保证常量池的实例唯一，编译期确定）
        if (this==obj){
            return true;
        }
        if (obj!=null&&obj.getClass()==this.getClass()){
            //类型相等 则强制转换后执行自定义比较
            cachemodeltest ci= (cachemodeltest) obj;
            //类属性为基本类型 返回调用自身比较的结果
            //或另写==进行比较 此处应当避免重复造轮子
            return this.getName().equals(ci.getName());
        }
        return false;
    }

    //实例测试
    public static void main(String[] args) {
        cachemodeltest abc = cachemodeltest.valueOf("abc");
        cachemodeltest adc =cachemodeltest.valueOf("adc");
        cachemodeltest abc1 =cachemodeltest.valueOf("abc");
        System.out.println(abc==adc);
        System.out.println(abc==abc1);
    }

}
