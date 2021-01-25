package PrimaryAlgorithm.PrimaryList;

public class List3 {
	/**反转链表
	 *思路:手写reverse
	 *先获取链表长度√
	 *如果长度为0或1,直接返回head√
	 *如果不是,正常进入循环√
	 *设置start和end两个指针,通过遍历指向头尾两端√
	 *每循环一次,start++,end--,同时交换val√
	 *交换之后,两个指针重新指向头结点,继续下一次循环
	 *直到不满足start<len/2||end>len/2,链表值交换完成,返回head
	 */
    public static ListNode reverseList(ListNode head) {
    	if (head==null) {
			return head;
		}
    	ListNode node1=new ListNode(0);
    	node1=head;
    	int len=1;
    	while(node1.next!=null){
    		node1=node1.next;
    		len++;
    	}
//    	System.out.println(len);
    	if (len==0||len==1) {
			return head;
		}
    	int start=0;
    	int end=len;
    	int temp=0;

    	node1=head;
    	ListNode node2=new ListNode(0);
    	node2=head;
    	while (start<len/2||end>len/2) {
			for (int i = 0; i <start; i++) {//跳到start位置
				node1=node1.next;
			}
//			System.out.println("此时,start="+node3.val);
			for (int j = 0; j < end-1; j++) {//跳到end位置
				node2=node2.next;
			}
//			System.out.println("此时,end="+node2.val);
			//开始交换
			temp=node1.val;
			node1.val=node2.val;
			node2.val=temp;
//			System.out.println("交换位置后start="+node3.val+",end="+node2.val);
			start++;
			end--;
			//交换一次之后需要重置指针位置
			node1=head;
			node2=head;
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
		reverseList(head1);
//		int temp=head1.val;
//		head1.val=head5.val;
//		head5.val=temp;
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
