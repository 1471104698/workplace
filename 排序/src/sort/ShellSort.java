package sort;

public class ShellSort {

	/**
	 * 排序方法
	 */
	public static void sort(int[] arr) {
		//初始化一个间隔
		int h=1;
		//计算最大间隔
		while(h<arr.length/3) {
			h=h*3+1;
		}
	}
}
