package tree;


/**
 * 	二叉树接口
 *  可以有不同的实现类，每个类可以实现不同的存储结构，比如顺序结构，链式结构 
 * @author hehe
 *
 */
public interface BinaryTree {

	/**
	 * 是否为空树
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * 树结点数量
	 * @return
	 */
	public int size();
	/**
	 * 获取二叉树的高度
	 * @return
	 */
	public int getHeight();
	/**
	 * 查询指定值的结点
	 * @param value
	 * @return
	 */
	public Node findKey(int value);//查找
	/**
	 * 前序递归遍历
	 */
	public void preOrderTraverse();
	/**
	 * 中序递归遍历
	 */
	public void inOrderTraverse();
	/**
	 * 后序递归遍历
	 */
	public void postOrderTraverse();
	/**
	 * 中序遍历非递归操作
	 * 1）对于任意结点current，若该结点不为空则将该结点压栈，并将左子树结点置为current,重复此操作，知道current为空。
	 * 2）若左子树为空，栈顶结点出栈，访问结点后将该结点的右子树置为current.
	 * 3)重复1，2步操作，直到current为空且栈内结点为空
	 */
	public void inOrderByStack();
	/**
	 * 前序遍历非递归操作
	 * 1）对于任意结点current，若该结点不为空则将该结点压栈，并将左子树结点置为current,重复此操作，知道current为空。
	 * 2）若左子树为空，栈顶结点出栈，访问结点后将该结点的右子树置为current.
	 * 3)重复1，2步操作，直到current为空且栈内结点为空
	 */
	public void preOrderByStack();
	/**
	 * 后序遍历非递归操作
	 * 1）对于任意结点current，若该结点不为空则将该结点压栈，并将左子树结点置为current,重复此操作，知道current为空。
	 * 2）若左子树为空，栈顶结点出栈，访问结点后将该结点的右子树置为current.
	 * 3)重复1，2步操作，直到current为空且栈内结点为空
	 */
	public void postOrderByStack();
	/**
	 * 按照层次遍历二叉树
	 */
	public void levelOrderByQueue();
	
	
}
