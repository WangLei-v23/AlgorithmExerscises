package Algorithm.LeetCode.Primary.List;

import java.util.HashSet;

public class T141_hasCycle {
    /**环形链表
     * 思路1：快慢双指针法
     *
     * 思路2：Hashset存储节点获得节点数量，遍历至链表尾，判断next是否为null
     *
     * 思路3：新创建的节点，在内存中的地址更靠后，
     *      直接使当前节点与next比较，判断是否存在节点地址是否跳跃
     *      （仅限C，邪道）
     *
     */

    public static boolean hasCycle(ListNode head) {
        //hashset法优化
        if (head==null) return false;
        ListNode setNode=head;
        HashSet<ListNode> set = new HashSet<ListNode>();
        while (true){
            if (set.add(setNode)) {
                if (setNode.next!=null){
                setNode=setNode.next;
                }else {
                    return  false;
                }
            }else {
                return  true;
            }

        }


        //hashset法
//        if (head==null) return false;
//        ListNode setnode=head;
//        int count = 0;
//        HashSet<ListNode> set = new HashSet<ListNode>();
//        while (set.size()==count){
//            set.add(setnode);
//            if (setnode.next!=null){
//                setnode=setnode.next;
//            }else {
//                return false;
//            }
//            count++;
//        }
//        int listLength=set.size();
//        setnode=head;
//        for (int i=0;i<listLength+1;i++){
//            if (setnode.next==null) return  false;
//        }


        //快慢指针法-我愿称你为最强
//        if (head==null) return false;
//        ListNode fast =head;
//        ListNode slow=head;
//        while (fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//
//            if (fast==slow) return  true;
//
//        }


    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;

        boolean b = hasCycle(node1);
        System.out.println(b);

    }
}
