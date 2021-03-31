package JavaBasic.lambdatest;

//定义接口 封装作为匿名内部类中传入的方法
interface User {
    void setName(String name);
}

interface addnumber{
    int addNum(int a,int b);
}

@FunctionalInterface
interface saySomthing{
    void say();
}

interface transToInteger{

}

public class testLambda {
    //将接口的实现类作为形参 调用实现类的方法 借用此方法将函数作为参数传递
    void useTest(User user) {
        user.setName("WangLei");
    }

    void addTest(addnumber add){
        System.out.println("相加："+add.addNum(5,6));
    }

    public static void main(String[] args) {
        //匿名内部类写法
        testLambda t = new testLambda();
        t.useTest(new User() {
            @Override
            public void setName(String name) {
                System.out.println(name);
            }
        });
        t.addTest(new addnumber() {
            @Override
            public int addNum(int a, int b) {
                return a+b;
            }
        });


        //Lambda写法  优雅plus
        t.useTest((name) -> {
            System.out.println(name);
        });
        t.addTest((a,b)->a+b);


        //函数式接口  实现了唯一的无参方法 此lambda表达式相当于创建了一个saySomthing对象
        saySomthing s=()->{
            for (int i = 0; i <5 ; i++) {
                System.out.println("hello world!");
            }
        };
        //调用方法 即可看到使用lambda表达式对于say方法的实现
        s.say();




    }
}
