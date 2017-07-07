
public class Solution24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(5);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		l1.next.next.next=new ListNode(1);
		ListNode sum=swapPairs(l1);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode swapPairs(ListNode head) {
        if (null == head) {  
            return head;  
        }   
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode cur = result;  
        ListNode next;  
        while (null != cur.next&&null!=cur.next.next) {  
            next = cur.next;  
            cur.next=cur.next.next; 
            next.next=cur.next.next;
            cur.next.next=next;
            cur = next;  
        }     
        return result.next;
    }

}
