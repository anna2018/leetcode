
public class Solution61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode rotateRight(ListNode head, int k) {
	        if(head==null||head.next==null||k==0)
	            return head;
	        ListNode fast = head, slow = head,countlen = head;
	        ListNode newhead = new ListNode(-1);
	        int len = 0;
	        
	        while(countlen!=null){
	            len++;
	            countlen = countlen.next;
	        }
	        
	        k = k%len;
	        if(k==0)
	            return head;
	        
	        for(int i = 0; i < k; i++)
	            fast = fast.next;
	        
	        while(fast.next!=null){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        
	        newhead = slow.next;
	        fast.next = head;
	        slow.next = null;
	        
	        return newhead;
    }

}
