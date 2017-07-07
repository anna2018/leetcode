
public class Solution19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(5);
//		l1.next=new ListNode(4);
//		l1.next.next=new ListNode(3);
//		l1.next.next.next=new ListNode(1);
		
		ListNode sum=removeNthFromEnd(l1, 1);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null||(head.next==null&&n==1)){
			return null;
		}
		ListNode reverse=reverse(head);
		ListNode temp=new ListNode(0);
		ListNode result=temp;
		for(int i=0;i<n-1;i++){
			result.next=reverse;
			reverse=reverse.next;
			result=result.next;
		}
		if(reverse.next!=null){
			reverse=reverse.next;
		}else{
			result.next=null;
			return reverse(temp.next);
		}
		while(reverse!=null){
			result.next=reverse;
			reverse=reverse.next;
			result=result.next;
		}
        return reverse(temp.next);
    }
	public static ListNode reverse(ListNode head) {  
        if (null == head) {  
            return head;  
        }  
        ListNode pre = head;  
        ListNode cur = head.next;  
        ListNode next;  
        while (null != cur) {  
            next = cur.next;  
            cur.next=pre;  
            pre = cur;  
            cur = next;  
        }  
        //将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head     
        head.next=null;  
        head = pre;    
        return head;  
    }
}
