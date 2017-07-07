

public class Solution2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(5);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2=new ListNode(5);
//		l2.next=new ListNode(6);
//		l2.next.next=new ListNode(4);
		ListNode sum=addTwoNumbers(l1, l2);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1=new ListNode(0);
        list1.next=l1;
        ListNode list2=new ListNode(0);
        list2.next=l2;
        ListNode current1=list1;
        ListNode current2=list2;
        int flag=0;
        for(;current1.next!=null&&current2.next!=null;current1=current1.next,current2=current2.next){
        	current1.next.val+=(current2.next.val+flag); 
        	flag=current1.next.val/10;
        	current1.next.val %=10;
        }
        if(current1.next==null&&current2.next==null&&flag==1){
        	current1.next = new ListNode(1);
    		return list1.next;
        }else if(current1.next==null){
        	current1.next=current2.next;
        }
        if(flag==0){
        	return list1.next;
        }
        for(;current1.next!=null;current1=current1.next){
        	current1.next.val+=flag;
        	flag=current1.next.val/10;
        	current1.next.val %=10;
        	if(flag==0){
        		break;
        	}	
        }
        if(current1.next==null&&flag==1) {
			current1.next = new ListNode(1);
		}
        return list1.next;
    }
}
