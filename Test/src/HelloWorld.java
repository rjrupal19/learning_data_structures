import java.util.Iterator;
import java.util.Stack;

public class HelloWorld {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.push(40);

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("Hello World!");

	}

}



/*
 * Create a new class Custom_Stack
 * 
 * push function: Inserts/Push a new element in the stack
 * pop function:  Deletes a element from Top of Stack
 * get_element_at_index: Gets a element at specific index
 * get_size:      Gets size of stack
 * is_empty:      Returns true if stack is empty else false
 * 
 */
