package Algorithm.LeetCode.Primary.List;


public class T21_mergeTwoLists {
	
	/**合并两个有序链表
	 */
	//思路1:将L2添加到L1,直到L2为空,返回L1
	//思路2:使用两个指针遍历L1和L2,将其顺序添加到L3中
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	//判断特殊情况
    	if (l1==null&&l2==null) {
			return null;
		}
    	if (l1!=null&&l2==null) {
			return l1;
		}
    	if (l1==null&&l2!=null) {
			return l2;
		}
    	//将头结点值较小的链表作为返回链表;
    	if (l1.val>l2.val) {
    		ListNode temp1=l1;
			l1=l2;
			l2=temp1;
		}
    	ListNode node1=new ListNode(0);
    	ListNode node2=new ListNode(0);
    	node1=l1;	
    	node2=l2;

    	ListNode temp=new ListNode(0);
    	//开始向L1中添加L2的元素
    	while (temp!=null) {
    		//L1.val小于L2且L1.next大于等于L2时,将L2插入L1之后,L2继续往后跳
    		//如果L1.next==null,直接将L2添加进L1
			if (node1.next==null||
					(node1.val<=node2.val&&node1.next.val>node2.val)
				) {
				temp=node2.next;
				node2.next=node1.next;
				node1.next=node2;
				node2=temp;
				continue;
			}
			if (node1.next.val<node2.val||node1.next!=null) {
				node1=node1.next;
			}
		}
    	
		return l1;
        
    }

	public static void main(String[] args) {
		ListNode head1=new ListNode(1);
		ListNode head2=new ListNode(2);
		ListNode head3=new ListNode(4);
//		ListNode head4=new ListNode(4);
//		ListNode head5=new ListNode(5);
		head1.next=head2;
		head2.next=head3;
		head3.next=null;
//		head4.next=head5;
//		head5.next=null;
		
		ListNode head6=new ListNode(1);
		ListNode head7=new ListNode(3);
		ListNode head8=new ListNode(4);
//		ListNode head9=new ListNode(4);
//		ListNode head10=new ListNode(4);
		head6.next=head7;
		head7.next=head8;
		head8.next=null;
//		head9.next=head10;
//		head10.next=null;

		mergeTwoLists(head1,head6);
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
