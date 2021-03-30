package com.atss.datastructure;
import java.util.Scanner;

import com.atss.datastructure.*;

public class Perform {
	Scanner scan =  new Scanner(System.in);
	Queue queue = new  Queue();
	Stack stack =  new Stack();
	
	public void enterData( ) {
		int n, data ;
		System.out.print("Enter number of nodes  :");
		n = scan.nextInt();
		for (int  i=0;i<n;i++) {
			//System.out.print("Enter data["+i+"] :");
			//data = scan.nextInt();
			data = (int) (Math.random()*100);
			queue.add(data);
			stack.push(data);
		}
		System.out.println("");
	}
	
	public void listData( ) {
		//System.out.println("Stack :");
		stack.list();
		//System.out.println("Queue :");
		queue.list();		
		//System.out.print("Heap :");
		//heap.list();		
	}	
	
	public void removeQ() {
		Node  node = queue.head;	
		System.out.println("Serving "+ queue.head.data);
		node = queue.remove();
		queue.list();	
	}
	
	public void stackPop() {	
		int data;
		System.out.print("Before :");
		stack.list();
		data =  stack.pop();
		System.out.println("Popping "+ data);
		System.out.print("After :");
		stack.list(); 
	}
	
	public void heapRemove() {
	}
	
	public void menu() {
		int opt =  0;
		do {
			System.out.println("Opciones");
			System.out.println("0. exit");
			System.out.println("1. generate data");
			System.out.println("2. list data");
			System.out.println("3. stack pop");
			System.out.println("4. queue remove");
			System.out.println("5. heap remove");
			opt = scan.nextInt();
			switch (opt) {
			   case 0 : break;
			   case 1 : enterData(); break;
			   case 2 : listData(); break;
			   case 3 : stackPop(); break;
			   case 4 : removeQ(); break;
			   case 5 : heapRemove();break;
			}
		} while (opt!=0);
	}
		
	public static void main(String [] args) {
		Perform operations = new Perform();
		operations.menu();
	}

}
