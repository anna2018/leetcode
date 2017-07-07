import java.util.LinkedList;
import java.util.Stack;

public class MinStack {

	    /** initialize your data structure here. */
		private Stack<Integer> stack;
		private Stack<Integer> sortedStack;
	    public MinStack() {
	        stack=new Stack();
	        sortedStack=new Stack();
	    }
	    
	    public void push(int x) {
	        stack.push(x);
	        if(sortedStack.isEmpty()){
	        	sortedStack.add(x);
	        }
	        else{
	        	if(sortedStack.peek()>x){
	        		sortedStack.add(x);
	        	}else{
	        		sortedStack.add(sortedStack.peek());
	        	}
	        }
	    }
	    
	    public void pop() {
	        stack.pop();
	        sortedStack.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	    	return sortedStack.peek();
	    }
	    public static void main(String[] args){
	    	MinStack minStack = new MinStack();
	    	minStack.push(-2);
	    	minStack.push(0);
	    	minStack.push(-3);
	    	System.out.println(minStack.getMin());  
	    	minStack.pop();
	    	System.out.println(minStack.top());     
	    	System.out.println(minStack.getMin());   

	    }
}
