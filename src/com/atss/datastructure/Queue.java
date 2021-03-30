package com.atss.datastructure;

class NodeQ {
	int data;
   NodeQ head;
   NodeQ tail;
   NodeQ next;
   
   NodeQ (int value) {
	   data =  value;
	   
   }
	
}

public class Queue {
	public NodeQ  head, tail;

	public Queue () {
		head =  null; tail = null;
	}
	public NodeQ remove() {
		NodeQ  node = null;;
		if (head !=null) {
		   node = head;
           head = head.next;
		}
		return node;
	}
	
	public void add (int data  ) {
		NodeQ node =  new NodeQ(data);
       if (head==null) 
    	  head = node;  
       else 
    	  tail.next = node;
 	  tail =  node;
	}
	
	public void list() {
		System.out.println("Queue status :");
		if (head==null) 
			System.out.println("Empty queue!!");
		else {
		   System.out.println("   Next :"+head.data);	
		   NodeQ node = head;
		   while(node!=null) {
              System.out.print("  "+node.data);	
              node = node.next;
		   }
		   System.out.println("");
		}
		System.out.println("");
	}
}
