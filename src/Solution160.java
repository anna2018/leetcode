
public class Solution160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode l1 = node1;
		l1.next = node2;
		l1.next.next = node3;
		ListNode l2 = node2;
		l2.next = node3;
		// l2.next.next=new ListNode(4);
		ListNode sum = getIntersectionNode(l1, l2);
		while (sum != null) {
			System.out.print(sum.val + "\t");
			sum = sum.next;
		}
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null && headB == null) {
			return null;
		}
		ListNode h1 = headA;
		ListNode h2 = headB;
		int count1 = 0;
		int count2 = 0;
		while (h1 != null) {
			count1++;
			h1 = h1.next;
		}
		while (h2 != null) {
			count2++;
			h2 = h2.next;
		}
		if (h1 != h2) {
			return null;
		} else {
			int count = Math.abs(count1 - count2);
			if (count1 > count2) {
				h1 = headA;
				h2 = headB;
			} else {
				h2 = headA;
				h1 = headB;
			}
			while (count > 0) {
				h1 = h1.next;
				count--;
			}
			while (h1 != null && h2 != null && h1 != h2) {
				h1 = h1.next;
				h2 = h2.next;
			}
			return h1;
		}
	}

}
