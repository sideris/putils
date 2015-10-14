package tree;

public abstract class TreeNode<T> {
	public T value;
	TreeNode<T> left, right;
	public TreeNode(T value) { this.value = value; }
}
