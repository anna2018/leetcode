import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(1);
		l1.next.next=new ListNode(2);
		l1.next.next.next=new ListNode(1);
		System.out.print(isPalindrome(l1));
	}
	public static boolean isPalindrome(ListNode head) {
        if(head==null){
        	return true;
        }
        Stack<Integer> stack =new Stack<Integer>();
        Queue<Integer> queue =new LinkedList<Integer>();
        while(head!=null){
        	stack.add(head.val);
        	queue.add(head.val);
        	head=head.next;
        }
        int size=stack.size()/2;
        for(int i=0;i<size;i++){
        	int t1=stack.pop();
        	int t2=queue.poll();
        	if(t1!=t2){
        		return false;
        	}
        }
        return true;
    }

}
