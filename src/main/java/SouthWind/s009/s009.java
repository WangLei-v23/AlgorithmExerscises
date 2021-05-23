package SouthWind.s009;

public class s009 {
    public static void main(String[] args) {
        SuperCustomer superCustomer = new SuperCustomer();
        OrdinaryCustomer ordinaryCustomer = new OrdinaryCustomer();
        //多态简单应用
        Cashier cashier1 = new Cashier();
        //相当于父类引用指向子类对象，自动完成向上转型（小范围转向大范围）
        //反之，如果是子类引用指向父类对象，则需要强制的向下转型（大范围转向小范围）
        cashier1.setCustomer(superCustomer);
        cashier1.settlement();
        System.out.println();
        Cashier cashier2 = new Cashier();
        cashier2.setCustomer(ordinaryCustomer);
        cashier2.settlement();
    }
}
