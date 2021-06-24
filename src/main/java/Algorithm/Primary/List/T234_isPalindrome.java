package Algorithm.Primary.List;

public class T234_isPalindrome {
	/**验证回文链表
	 * 思路1：设置两个指针，两种走法
	 * 		走法1：两个指针都从中间开始，向两头跑
	 * 		走法2：一个指针从中间开始往后跑，另一个从链表头节点往中间跑
	 * 两个指针比较一次之后，复位，再一次定位后再进行比较
	 * 如果中间出现node1.val!=node2.val的情况，返回false
	 * 如果node2可以走到链表尾，说明是回文链表；
	 * 缺点：两指针的多次定位时间复杂度太高。
	 * 思考：减少指针定位消耗的时间，考虑使用数组比较
	 * 
	 * 
	 * 思路2：将链表录入数组，在数组中进行比较。
	 * 先获取链表的长度，申请对应长度的数组；
	 * 遍历链表，录入数组；
	 * 设置两个指针，也是两种走法进行比较；
	 * 
	 */
    public static boolean isPalindrome(ListNode head) {
//    	//判断特殊情况
//    	if (head==null||head.next==null) {
//			return true;
//		}
//    	boolean b=true;
    	//思路1
//    	//先获取list的长度
//    	ListNode lenode=new ListNode(0);
//    	lenode=head;
//    	int len=0;
//    	while(lenode!=null){
//    		lenode=lenode.next;
//    		len++;
//    	}
//    	if (len==2) {
//			if (head.val!=head.next.val) {
//				return false;
//			}else{
//				return true;
//			}
//		}
////    	System.out.println("len="+len);
//    	//两指针分别指向头和中间，进行比较;
//    	//如果不同，返回false;
//    	//当遍历到start2=null时，中断
//    	
//    	int start1=0;
//    	int start2=len-1;
//
//    	ListNode node1=new ListNode(0);
//    	node1=head;
//    	ListNode node2=new ListNode(0);
//    	node2=head;
//
//
////    	System.out.println("start2="+start2);
//    	while (b==true) {
//			//使node2位于strat2位置
//			for (int j =0; j<start2; j++) {
//				node2=node2.next;
//			}
//			if (node1.val!=node2.val) {
//				b=false;
//			}
//			node1=node1.next;
//			node2=head;
//			start1++;
//			start2--;
//			if (start1>=start2) {
//				break;
//			}
//			
//		}
    	
    	//思路2
    	//先获取链表的长度，申请对应长度的数组；
    	//判断特殊情况
    	if (head==null||head.next==null) {
			return true;
		}
    	boolean b=true;
    	ListNode lenode=new ListNode(0);
    	lenode=head;
    	int len=0;
    	while(lenode!=null){
    		lenode=lenode.next;
    		len++;
    	}
    	
//    	System.out.println("len="+len);
    	
    	int[] nums=new int[len];
    	//遍历链表，录入数组；
    	lenode=head;
    	for (int i = 0; i < nums.length; i++) {
			nums[i]=lenode.val;
			lenode=lenode.next;
		}
    	
//    	for (int j = 0; j < nums.length; j++) {
//			System.out.print(nums[j]+" ");
//		}
    	
   	 	//设置两个指针，也是两种走法进行比较（这里使用第一种
    	int start=0,end=nums.length-1;

//    	System.out.println("end="+end);
    	while (start<nums.length/2) {
			if (nums[start]!=nums[end]) {
				b=false;
				break;
			}else{
				start++;
				end--;
			}
		}
    	
    	
		return b;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1=new ListNode(1);
		ListNode head2=new ListNode(0);
		ListNode head3=new ListNode(0);
		ListNode head4=new ListNode(0);
		ListNode head5=new ListNode(1);
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		head5.next=null;

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
		
		System.out.println(isPalindrome(head1));
	}

}
