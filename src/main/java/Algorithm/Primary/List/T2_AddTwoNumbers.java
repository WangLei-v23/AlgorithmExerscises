package Algorithm.Primary.List;

/**
 * description: AddTwoNumbers
 * date: 2020/7/29 22:22
 * package ReviewAndPractice
 * author: WangLei
 * version: 1.0
 */
public class T2_AddTwoNumbers {
    public static void main(String[] args) {

        //243
        ListNode node1 = new ListNode(2);
        node1.next=new ListNode(4);
        node1.next.next=new ListNode(5);;
        //564
        ListNode node2 = new ListNode(5);
        node2.next=new ListNode(6);
        node2.next.next=new ListNode(4);

        ListNode sum=addTwoNum(node1,node2 );
        while (sum!=null){
            System.out.print(sum.val+" ");
            sum=sum.next;
        }

    }

    /**
    * @Author: WangLei
    * @Description: //TODO 加算两条链表
    * @Date: 23:33 2020/7/30
    * @Param: [l1, l2] 
    * @return: ReviewAndPractice.ListNode
    **/
    public static ListNode addTwoNum(ListNode l1,ListNode l2){
        //边界条件 如果两个链表都为空 则直接返回null
        if (l1==null&&l2==null) return null;

        //创建指向原链表的指针
        ListNode n1=l1;
        ListNode n2=l2;
        //需要返回的合成链表
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        //进位数
        int addOne=0;

        //进入遍历
        while ((n1!=null||n2!=null)||addOne>0){
            //判断将要计算的值
            int x = (n1 != null) ? n1.val : 0;
            int y = (n2 != null) ? n2.val : 0;

            //计算需要添加的结点值 以及下次计算需要的进位数
            int sum=x+y+addOne;
            addOne=sum/10;
//            System.out.println("sum="+sum+" addone="+addOne);

            //将计算好的结点添加到head
            head.next = new ListNode(sum%10);
//            System.out.println("head.next.val="+head.next.val);
            head=head.next;


            //判断取值结点的指针是否需要后移
            if (n1!=null) n1=n1.next;
            if (n2!=null) n2=n2.next;
        }

        return dummy.next;
    }
}


/**
* @Author: WangLei
* @Description: //TODO 题目要求的ListNode
* @Date: 22:25 2020/7/29
* @Param:  
* @return: 
**/
class ListNode{
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }

}
