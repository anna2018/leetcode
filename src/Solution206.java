import java.util.Stack;


public class Solution206 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(3);
		l1.next.next.next=new ListNode(4);
		l1.next.next.next.next=new ListNode(5);
		ListNode sum=reverseList(l1);
		while(sum!=null){
			System.out.print(sum.val+"\t");
			sum=sum.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
        ListNode list=new ListNode(0);
        list.next=head;
        ListNode cur=list.next;
        Stack<Integer> stack =new Stack<Integer>();
        while(head!=null){
        	stack.add(head.val);
        	head=head.next;
        }
        while(!stack.isEmpty()){
        	int temp=stack.pop();
        	cur.val=temp;
        	cur=cur.next;
        }
        cur=null;
        return list.next;
    }
}
