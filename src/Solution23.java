
public class Solution23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists==null || lists.length==0)  
            return null;  
    	return helper(lists,0,lists.length-1); 
    }
    private ListNode helper(ListNode[] lists, int l, int r)  
    {  
        if(l<r)  
        {  
            int m = (l+r)/2;  
            return mergeTwoLists(helper(lists,l,m),helper(lists,m+1,r));  
        }  
        return lists[l];  
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
