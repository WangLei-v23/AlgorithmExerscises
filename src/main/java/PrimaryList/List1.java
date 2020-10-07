package PrimaryList;

public class List1 {
    /**删除指定结点node
     *思路:
     *因为没有数组,正常删除需要获取node的上一个结点
     *但是这里无法获取,因此
     *我们将node.next的值赋给node,再另node指向下下个结点 
     *太nb了这个方法= =
     */
    public static void deleteNode(ListNode node) {
   	node.val=node.next.val;
   	node.next=node.next.next;

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
//		deleteNode(head4);
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
