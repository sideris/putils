package tree;


interface Tree<T> {
	TreeNode<?> root = null;
	int maxChildren = 2;
	void addNode(TreeNode<T> node);
	TreeNode<T> getRoot();
	TreeNode<T>[] getChildren();
	int getChildCount(TreeNode<T> node);
	int getDepth(TreeNode<T> node);
	void printBFS();
	void printPreOrdersDFS();
	void printInOrdersDFS();
	void printPostOrdersDFS();
	int searchBFS(TreeNode<T> node);
	TreeNode<T> searchBFS(T value);
	int searchPreOrderDFS(TreeNode<T> node);
	TreeNode<T> searchPreOrderDFS(T value);
	int searchInOrderDFS(TreeNode<T> node);
	TreeNode<T> searchInOrderDFS(T value);
	int searchPostOrderDFS(TreeNode<T> node);
	TreeNode<T> searchPostOrderDFS(T value);
	void setRoot(TreeNode<T> node);
}

