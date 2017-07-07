
public class Solution203 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(3);
		l1.next.next.next=new ListNode(1);
		l1.next.next.next.next=new ListNode(2);
		ListNode sum=removeElements(l1, 1);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode removeElements(ListNode head, int val) {
		if(head==null){
			return null;
		}
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode pre=result;
        ListNode cur=result.next;
        while(cur!=null){
        	if(cur.val==val){
        		cur=cur.next;
        		pre.next=cur;
        	}
        	else{
        		cur=cur.next;
        		pre=pre.next;
        	}
        }
        return result.next;
    }

}
