package sideris.putils.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraverse {
	
    public static void breadthFirstSearch(Queue queue){
        if (queue.isEmpty()) return;
        Node node = (Node)queue.poll();
        System.out.println ("polling node: " + node.data);
        if (node.left!=null) queue.offer(node.left);
        if (node.right!=null) queue.offer(node.right);
 
        breadthFirstSearch (queue);
    }
    
    public static void breathFirstSearch(Node root){
    	if(root == null) return;

    	Queue<Node> q = new LinkedList<Node>();
    	q.offer(root);
    	
    	while( !q.isEmpty() ){
    		Node tmp = q.poll();
    		System.out.println("Polling " + tmp.data);
    		if(tmp.left != null) q.offer(tmp.left);
    		if(tmp.right != null) q.offer(tmp.right);
    	}
    }
    
    public static void preOrderDFS(Node root){
    	if(root == null) return;
    	
		System.out.println("Polling " + root.data);
		if(root.left != null) preOrderDFS(root.left);
		if(root.right != null) preOrderDFS(root.right);
    }
    
    public static void inOrderDFS(Node root){
    	if(root == null) return;
    	
		if(root.left != null) inOrderDFS(root.left);
		System.out.println("Polling " + root.data);
		if(root.right != null) inOrderDFS(root.right);
    }
    
    public static void postOrderDFS(Node root){
    	if(root == null) return;
    	
		if(root.left != null) postOrderDFS(root.left);
		if(root.right != null) postOrderDFS(root.right);
		System.out.println("Polling " + root.data);
		
    }
  
}
