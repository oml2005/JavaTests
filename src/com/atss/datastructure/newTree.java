package com.atss.datastructure;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class newTree {

//	static class Node {
//		int data ;
//		Node left;
//		Node right;
//		
//           Node (int value) {
//        	   this.data = value;
//        	   this.left =  null;
//        	   this.right = null;
//           }
//	}



	void insert(Node<Integer> node,  int value) {
         if (value<node.data) { // look to the left
        	 if (node.left==null) 
        		 node.left = new Node(value);
        	 else
        		 insert(node.left,value);
         } else {  //look to the right
        	 if (node.right==null)
        		 node.right = new Node(value);
        	 else
        		 insert(node.right,value);
         }
	}

	void inOrder(Node<Integer> node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.data+ "  ");
			inOrder(node.right);
		}
	}
	
	void preOrder(Node<Integer> node) {
		if (node != null) {
			System.out.println(node.data+ "  ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}	
	
	void postOrder(Node<Integer> node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data+ "  ");			
		}
	}	
	
	String contains(Node<Integer> node, int value) {
		if (node == null)
			return  "NOT";
		else 
			if (value== node.data) 
				return  "YES";
			 else 
				if (value<node.data)  // look left
		           return contains(node.left,value);
		           else  return contains(node.right,value);
	}
		
	public static void main (String[] args) {
		newTree tree =  new newTree() ;  
		
		List<Integer> list = new ArrayList<>();

		try {
			FileReader file = new FileReader("c:/temp/integers.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				list.add(sc.nextInt());
			};
			
			System.out.println("Data read :");
			for (int i : list)
				System.out.println(i);
			
			Node <Integer> root = new Node(list.get(0));
			System.out.println("Tree root :"+ root.data);
			
			//inserting nodes in tree
			for (int i=1; i<list.size(); i++) {
				tree.insert(root,list.get(i));
			};
			
			BTreePrinter.printNode( root);
			
			System.out.println("\n\nIn order ");
			tree.inOrder(root);
			System.out.println("\n\npre order ");			
			tree.preOrder(root);
			System.out.println("\n\npost order ");			
			tree.postOrder(root);
			int tmp =6650;
			System.out.println(tmp+" is " + tree.contains(root, tmp)+" contained");
			
		}
		catch (IOException e) {
			System.out.println("Error "+e );
		}
	}

}
