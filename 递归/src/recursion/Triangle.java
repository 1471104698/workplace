package recursion;

public class Triangle {

	public static int getNumber(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getNumber(n-1);
		}
	}
}
