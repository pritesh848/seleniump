package collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push('k');   
		st.push(56);    //adds the value to the top of stack
		System.out.println(st.peek());  //reads the top value of the stack

		st.pop();    //removes the top value from stack
		System.out.println(st.peek());

		
	}
}
