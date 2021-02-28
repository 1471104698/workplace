package cn.oy.BinaryTree;

public class BinaryTree {
	
	Node root;
	public void add(int data) {
		if(root==null) {
			root=new Node(data);
		}else {
			root.addNode(data);
		}
	}
	public void printf() {
		root.printfNode();
	}
	private class Node{
		private int data;
		private Node leaf;
		private Node right;
		
		public Node(int data){
			this.data=data;
		}
		public void addNode(int data) {
			if(this.data>data) {
				if(this.leaf==null) {
					this.leaf=new Node(data);
				}else {
					this.leaf.addNode(data);
				}
			}else {
				if(this.right==null) {
					this.right=new Node(data);
				}else {
					this.right.addNode(data);
				}
			}
		}
		
		public void printfNode() {
			if(this.leaf!=null) {
				this.leaf.printfNode();
			}
			System.out.print(this.data+"->");
			if(this.right!=null) {
				this.right.printfNode();
			}
		}
	}
}
