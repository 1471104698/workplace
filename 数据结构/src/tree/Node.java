package tree;

/**
 * 二叉链表的结点
 * @author hehe
 *
 */
public class Node {

	Object value;	 	//结点的值
	Node leftChild;		//左子树的引用，不加private，省去get set方法
	Node rightChild;	//右子树的引用
	
	public Node(Object value, Node leftChild, Node rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public Node() {
	}
	
	@Override
	public String toString() {
		return "Node [value=" + value + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	public Node(Object value) {
		super();
		this.value = value;
	}

}
