package stack;

public class Test {
	
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.push(3);
		stack.push(2);
	
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+"  ");
		}
	}
}
