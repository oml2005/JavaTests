package com.atss.datastructure;

public class  BinTree {
	int data;
	BinTree left, right;
	public  BinTree (int data) {
		this.data = data;
	}

	public  BinTree () {};

	public void insert(int value) {
		if (value<=data) {  // insert to the left
			if (left==null) {
				left  = new BinTree(data);
			}
			else {
				left.insert(value);
			}
		}  
		else {  // insert to the  right
			if (right==null) {
				right = new BinTree(value);
			} else {
				right.insert(value);
			}
		}
	}

	public boolean contains(int value) {
		if  (value==data) {   
			return true;
		} else {
			if (value<=data) {
				if (left==null)
					return false;
				else 
					return left.contains(value);
			} else {
				if (right==null)
					return false;
				else  
					return right.contains(value);
			}
		}
	}

	public void printInOrder() {
		if (left!=null) {
			left.printInOrder( );
		}  
		System.out.println(data+" ");
		if (right!=null) {
			right.printInOrder( );
		}  ;
	}

	public void printPreOrder() {
		System.out.println(data+" ");
		if (left!=null)
			left.printPreOrder();
		if (right!=null)
			right.printPreOrder();
	}

	public void printPostOrder() {
		if (left!=null)
			left.printPostOrder();
		if (right!=null)
			right.printPostOrder();
		System.out.println(data+" ");
	}
}