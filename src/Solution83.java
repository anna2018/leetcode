import java.util.HashSet;

public class Solution83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(2);
//		l1.next.next=new ListNode(2);
		ListNode sum=deleteDuplicates(l1);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode current=result.next;
        while(head.next!=null){
        	if(head.next.val==head.val){
        		head=head.next;
        	}else{
        		current.next=head.next;
        		current=current.next;
        		head=head.next;
        	}
        }
        if(current.val==head.val){
        	current.next=null;
        }
        return result.next;
    }

}
