
package com.test;

public class Tester {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
	    int valuesToAdd[] = {50, 30, 70, 20, 40, 60, 80};

	    for (int value : valuesToAdd) {
	        tree.recAddNode(value);
	    }

	    tree.preOrder();
	    tree.inOrder();
	    tree.postOrder();
	}

	/*
	 *
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(13);

		 
	 */
}
