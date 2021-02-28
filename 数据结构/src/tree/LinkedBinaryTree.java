package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree {

	private Node root;//根结点
	
	public LinkedBinaryTree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LinkedBinaryTree(Node root) {
		super();
		this.root = root;
	}

	@Override
	public boolean isEmpty() {
		
		return null==root;
	}

	@Override
	public int size() {
		System.out.println("二叉树结点的个数为：");	//因为这里没有增加结点的方法，是在外部手动添加的，故此方法没什么用，后续改进
		return this.size(root);
	}
	private int size(Node root) {
		if(null!=root) {
			//获取左子树的size
			int nl=this.size(root.leftChild);
			//获取右子树的size
			int nr=this.size(root.rightChild);
			//返回左子树，右子树size并加1
			return nl+nr+1;
			}else
			return 0;
	}

	@Override
	public int getHeight() {
		System.out.println("二叉树的高度是：");
		return getHeight(root);
	}
	private int getHeight(Node root) {
		if(null!=root) {
		//获取左子树的高度
		int nl=this.getHeight(root.leftChild);
		//获取右子树的高度
		int nr=this.getHeight(root.rightChild);
		//返回左子树，右子树较大高度并加1
		return nl>nr?nl+1:nr+1;
		}else
		return 0;
		
	}
	

	/**
	 * 查找某个值的结点
	 */
	@Override
	public Node findKey(int value) {
		return this.findKey(value, root);
	}
	
	private Node findKey(Object value,Node root) {
		if(null==root)		//递归结束条件1：根为空，即为空树
			return null;
		else if(root.value==value) {		//递归结束条件2：找到了
			return root;
			}
		else {		//递归体
			Node node1=this.findKey(value, root.leftChild);
			Node node2=this.findKey(value, root.rightChild);
			if(null!=node1&&node1.value==value)
				return node1;
			else if(null!=node2&&node2.value==value)
				return node2;
			else
				return null;
		}
}
	


	@Override
	public void preOrderTraverse() {
		//输出根结点的值
		if(null!=root) {
		System.out.print(root.value+"  ");
		
		//对左子树进行先序遍历
	
		//创建一个二叉树，根是左子树的根
		BinaryTree leftTree=new LinkedBinaryTree(root.leftChild);
		leftTree.preOrderTraverse();		
		
		//对右子树进行先序遍历
		//创建一个二叉树，根是右子树的根
		BinaryTree rightTree=new LinkedBinaryTree(root.rightChild);
		rightTree.preOrderTraverse();
		}
	}

	
	/**
	 * 中序递归遍历
	 */
	@Override
	public void inOrderTraverse() {
		System.out.println("中序遍历：");
		this.inOrderTraverse(root);
		System.out.println();

	}
	/**
	 * 辅助方法
	 * @param node
	 */
	private void inOrderTraverse(Node node) {
		if(null!=node) {
			//遍历左子树
			this.inOrderTraverse(node.leftChild);		//对该根结点的左子树进行遍历，当 左子树为空时，停止遍历，进行下面的操作
			
			//输出根的值
			System.out.print(node.value+"  ");
			
			//遍历右子树
			this.inOrderTraverse(node.rightChild);
		}

	}

	/**
	 * 后序递归遍历
	 */
	@Override
	public void postOrderTraverse() {
		System.out.println("后序遍历：");
		this.postOrderTraverse(root);
		System.out.println();
	}
	/**
	 * 辅助方法
	 * @param node
	 */
	private void postOrderTraverse(Node node) {
		if(null!=node) {
			this.postOrderTraverse(node.leftChild);
			
			this.postOrderTraverse(node.rightChild);
			
			System.out.print(node.value+"  ");
		}
	}

	/**
	 * 中序非递归遍历
	 */
	@Override
	public void inOrderByStack() {
		

	}

	@Override
	public void preOrderByStack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void postOrderByStack() {
		// TODO Auto-generated method stub

	}

	/**
	 * 按照层次遍历二叉树
	 */
	@Override
	public void levelOrderByQueue() {
		System.out.println("按照层次遍历二叉树：");		
		if(null==root)	//空树
			return; 
		Queue<Node> queue=new LinkedList<Node>();	//创建一个链表结构的队列
		queue.add(root);		//入队
		while(queue.size()!=0) {		//结点遍历完则为空
			int len=queue.size();	//得到队列里的结点数，相对应地遍历几次
			for(int i=0;i<len;i++) {
				Node temp=queue.poll();		//出队，即将第一个输出
				System.out.print(temp.value+"  ");//输出
				if(null!=temp.leftChild)		//将结点的左右孩子依次放入队列中
					queue.add(temp.leftChild);
				if(null!=temp.rightChild)
					queue.add(temp.rightChild);
			}
		}
		System.out.println();
			
	}

}
