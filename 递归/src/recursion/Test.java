package recursion;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
//		System.out.println(Triangle.getNumber(3));
//		
//		System.out.println(Fibonacci.getNumber(20));
		List<Integer> list=test(9);
		System.out.println(list.toString());
		
	}
	static List<Integer> list=new ArrayList<>();
	public static List<Integer> test(int n){
		
		if(n==1) {
			list.add(1);
			return list;
		}else {
			list.add(n);
			test(n-1);
			return list;
		}
		
	}
}
