
public class Solution141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l0=new ListNode(0);
		ListNode head=l0;
		head.next=new ListNode(1);
//		head.next.next=new ListNode(2);
//		head.next.next.next=new ListNode(3);
//		head.next.next.next.next=l0;
		System.out.println(hasCycle(head));
	}
	public static boolean hasCycle(ListNode head) {

        if(head==null||head.next==null){
        	return false;
        }
        ListNode l1=head.next;
        ListNode l2=head.next.next;
        while(l2!=null&&l2.next!=null){
        	if(l1.val==l2.val){
        		return true;
        	}
        	l1=l1.next;
        	l2=l2.next.next;
        }
        return false;
    }

}
