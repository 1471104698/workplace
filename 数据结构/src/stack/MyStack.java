package stack;

public class MyStack {
	
	//底层是数组
	private Object[] arr;
	private int top;	//栈顶指针
	private final static int maxSize=10;
	
	//默认的构造方法
	public MyStack() {
		this(maxSize);
	}
	
	//带参数的构造方法，参数为数组的大小
	public MyStack(int maxsize) {
		 if(maxsize >0){
		arr=new Object[maxsize];
		top=-1;
		}else {
			new RuntimeException("栈的容量只能为正整数");
		}
	}
	
	//添加数据
	public void push(int value) {
		if(isFull()){		//满栈则进行扩容，扩为原来的长度加一半
			Object[] temp = arr;
			this.arr = new Object[arr.length +(arr.length>>2)];
			System.arraycopy(temp, 0, arr, 0, temp.length);
     }
		System.out.println("top="+top);
         arr[++top]=value;
	}
	
	//弹出数据
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return arr[top--];
	}
	
	///查看栈顶元素
	public Object peek() {
		if(!isEmpty()) {
		return arr[top];
		}
		return null;
	}
	
	//判断是否为空
	public boolean isEmpty() {
		return top==-1;
	}
	
	//判断是否满栈
	public boolean isFull() {
		return top==arr.length-1;	//top存数据从0开始的
	}
	
	//得到栈的长度
	public int length() {
		return top+1;
	}
	
	
	
	
}
