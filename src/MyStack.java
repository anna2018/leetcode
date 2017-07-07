import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		stack.push(1);	
//		stack.push(2);
//		stack.push(3);
//		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.empty());
	}

	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		queue1.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (queue1.isEmpty()) {
			return;
		} else {
			while (queue1.size() > 1) {
				queue2.add(queue1.poll());
			}
			queue1.poll();
			Queue temp = queue1;
			queue1 = queue2;
			queue2 = temp;
			return;
		}
	}

	// Get the top element.
	public int top() {
		while (queue1.size() > 1) {
			queue2.add(queue1.poll());
		}
		int top = queue1.peek();
		queue2.add(queue1.poll());
		Queue temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return top;

	}

	// Return whether the stack is empty.
	public boolean empty() {
		if (queue1.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
