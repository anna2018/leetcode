
public class Solution21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(2);
//		l1.next=new ListNode(3);
//		l1.next.next=new ListNode(4);
		ListNode l2=new ListNode(1);
//		l2.next=new ListNode(5);
//		l2.next.next=new ListNode(6);
		ListNode sum=mergeTwoLists(l1, l2);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null&&l2==null){
			return null;
		}
		if(l1==null&&l2!=null){
			return l2;
		}
		if(l1!=null&&l2==null){
			return l1;
		}
        ListNode result=new ListNode(0);
        ListNode temp=result;
        while(l1!=null&&l2!=null){
        	if(l1.val<l2.val){
        		temp.next=l1;
        		l1=l1.next;
        	}else{
        		temp.next=l2;
            	l2=l2.next;
        	}
        	temp=temp.next;
        }
        while(l1!=null){
        	temp.next=l1;
        	l1=l1.next;
        	temp=temp.next;
        }
        while(l2!=null){
        	temp.next=l2;
        	l2=l2.next;
        	temp=temp.next;
        }
        return result.next;
    }
}
