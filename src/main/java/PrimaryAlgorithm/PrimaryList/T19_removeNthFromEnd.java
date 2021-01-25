package PrimaryAlgorithm.PrimaryList;

public class T19_removeNthFromEnd {
    /**删除链表的倒数第N个节点
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     * 
     * 思路:
     * 先判断特殊情况(n==0),再求链表长度
     * 如果删除位置在第一个,返回null
     * 由length和n,得到待删除结点的前一个位置
     * 删除操作,返回head
     * 
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	if (n==0) {//判断特殊情况
			return head;
		}
		int length=0;
		ListNode node1=new ListNode(0);
		node1=head;
		while (node1!=null) {//求链表长度
			length++;
			node1=node1.next;
		}
		if (n==length) {//如果删除位置在第一个
			if (length==1) {
				return head=null;
			}else{
			head.val=head.next.val;
			head.next=head.next.next;
			}
			return head;
		}
		int del=length-n;//得到待删除结点的前一个位置
		ListNode node2=new ListNode(0);
		node2=head;
		for (int count = 1; count <=del; count++) {
			if (count==del) {
				node2.next=node2.next.next;
			}else {
				node2=node2.next;
			}
		}
    	
    	return head;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1=new ListNode(1);
		ListNode head2=new ListNode(2);
		ListNode head3=new ListNode(3);
		ListNode head4=new ListNode(4);
		ListNode head5=new ListNode(5);
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		head5.next=null;
		removeNthFromEnd(head1,5);
		ListNode head=new ListNode(head1.val);
		head=head1;
		while(head!=null){
			if (head.next==null) {
				System.out.println(head.val);
			}else{
			System.out.print(head.val+"->");
			}
			head=head.next;
		}
	}

}
