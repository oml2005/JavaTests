package com.atss.datastructure;

public  class Stack {
	public Node top,  base ;
	
	public  Stack() {
		top = null; base =  null;
	}
	
	public int pop() {
	   int  data =  0;
       if (top != null) { 	
    	  data = top.data;
    	  top = top.next ;
       }
       return data;
	}
	
	public void push(int data ) {
		Node node =  new Node(data);
		if (base==null) {
			base = node ;
			top =node;
		} else {
			node.next = top;   // apunta al anterior
			top = node;
		}
	}
	
	public void list() {
		Node node = top;
		System.out.println("Stack status :");
		if (top==null)
			 System.out.println("Empty stack!");
		else {
		   System.out.println("   Top :"+top.data);	  	
		   while(node!=null) {
              System.out.print("  "+node.data);	
              node = node.next;
		   }
		   System.out.println("");
		}
		System.out.println("");
	}  
}
