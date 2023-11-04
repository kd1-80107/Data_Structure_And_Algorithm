
package com.test;

public class BinarySearchTree {

	public  class Node{
		private int data;
		private Node left;
		private Node right;

		public Node(int data) 
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}	
	}

	public Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	boolean isEmpty(){
		return root==null;
	}

	public void addNode(int value)
	{
		Node nn=new Node(value);

		if(isEmpty())
			root=nn;
		else 
		{ 
			Node trav=root;

			while(true)
			{
				if(value < trav.data) 
				{
					if(trav.left==null)
					{
						trav.left=nn;
						break;
					}
					else 
						trav=trav.left; 
				}
				else 
				{
					if(trav.right==null)
					{
						trav.right=nn;
						break;
					}
					else 
						trav=trav.right; 
				}
			}//while

		}  
	}//addnode



	public void preOrder(Node trav) {
		// stop if trav is null
		if(trav == null)
			return;
		// visit current node (print data)
		System.out.print(" " + trav.data);
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
	}

	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
	public void postOrder(Node trav) {
		// stop if trav is null
		if(trav == null)
			return;
				// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
		// visit current node (print data)
		System.out.print(" " + trav.data);

	}


	void postOrder() {
		System.out.print("PostOrder : ");
		postOrder(root);
		System.out.println("");
	}

	void inOrder() {
		System.out.print("InOrder : ");
		inOrder(root);
		System.out.println("");
	}
	
	public void inOrder(Node trav) {
		// stop if trav is null
		if(trav == null)
			return;
				// go into left of current node
		preOrder(trav.left);
		// visit current node (print data)
				System.out.print(" " + trav.data);
		// go into right of current node
		preOrder(trav.right);
		

	}


	public void recAddNode(int value) {
		root = recAddNode(root, value);
	}

	private Node recAddNode(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = recAddNode(current.left, value);
		} else if (value > current.data)
		{
			current.right = recAddNode(current.right, value);
		}
		return current;
	}

}
