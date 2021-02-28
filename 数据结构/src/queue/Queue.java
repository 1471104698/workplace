package queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue {

	//利用栈（队列实现）将十进制转换成二进制
	public static void main(String[] args) {
		//给定一个十进制数
		int n=31;
		int t=n;
		String str="";
		//把十进制数转换成二进制
		int r;
		Deque<Integer> stack=new LinkedList<Integer>();
		do {
			r=t%2;
			stack.push(r);
			t/=2;
		}while(t!=0);
		while(!stack.isEmpty()) {
			str+=stack.pop();
		}
		//输出结果
		System.out.println(n+"---->"+str);
	}
}
