package com.atss.datastructure;
import java.io.FileReader;
import java.io.IOException;
import  java.util.*;

public class DataStruct {
	
	static class Node {
		int value;
		Node left,  right;
		Node (int value) {
			this.value  = value;
			this.left = null;
		    this.right = null  ;
		}
	}

	public void insert(Node node, int value ) {
		Node tmp = new Node(value);
		if (value<node.value) {  // look  to the  left
			if (node.left  == null) {  // insert here
				node.left = tmp;
				System.out.println(value +" inserted to the left of "+node.value);
			}  else   // keep looking to the left
				insert(node.left, value);			
		} else {  // look to the right
			if (node.right == null) {  // insert here
				node.right = tmp;
				System.out.println(value +" inserted to the right of "+node.value);
			} else   // keep looking to  the  right
				insert(node.right,value);				
		}
	}
	
	public void printInOrder(Node node) {   
       if (node.left!=null)
    	   printInOrder(node.left);
       System.out.println(+node.value+" ");
       if (node.right!=null)
    	   printInOrder(node.right);	
	}

	public static void main(String[] args)  {

		//Scanner scan =  new Scanner(System.in)	;

		try {
			FileReader  fileIn = new FileReader("c:/temp/integers.txt");  
			Scanner scan =  new Scanner(fileIn)	;
			List<Integer>  list = new ArrayList<>();
			
			while (scan.hasNextInt()) {
				list.add(scan.nextInt());
			}
			DataStruct tree =  new DataStruct();
			
			Node root = new Node(list.get(0));
			System.out.println("Root :"+root.value);
			for (int i=1;  i<list.size();i++) {
				int item = list.get(i);
				System.out.println("     Inserting node("+(i+1)+") =:"+item);
				//BinTree node =  new BinTree(item);
				tree.insert(root, item);
			};
			System.out.println("Printing in Order ------------");
		
			tree.printInOrder(root);
			
		}
		catch (Exception e) {
			System.out.println("Error :"+e);
		}


	}
}
