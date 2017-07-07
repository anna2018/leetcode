
public class Solution92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode root=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		root.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		ListNode result=reverseBetween(root,2,4);
		while(result.next!=null){
			System.out.println(result.val);
			result=result.next;
		}
	}
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null)  
	        return null;  
	    ListNode dummy = new ListNode(0);  
	    dummy.next = head;  
	    ListNode preNode = dummy;  
	    int i=1;  
	    while(preNode.next!=null && i<m)  
	    {  
	        preNode = preNode.next;  
	        i++;  
	    }  
	    if(i<m)  
	        return head;  
	    ListNode mNode = preNode.next;  
	    ListNode cur = mNode.next;  
	    while(cur!=null && i<n)  
	    {  
	        ListNode next = cur.next;  
	        cur.next = preNode.next;  
	        preNode.next = cur;  
	        mNode.next = next;  
	        cur = next;  
	        i++;  
	    }  
	    return dummy.next; 
    }

}
