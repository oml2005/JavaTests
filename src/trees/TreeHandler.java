package trees;
import  java.util.*;



public class TreeHandler {
	public static  Node tree =  null;
	public static  Node rootTmp = null;
	public static  Node treeCopy = null;

	public  static  Node populate(int n) {
		System.out.print("Generating : ");
		for (int i=0;i<n;i++) {
			int data = (int) (Math.random()*100);
			System.out.print(data+"  ");
			if (tree==null) {
				tree= new Node(data);
			} else
			    tree.insert(data);
		} 
		System.out.println("");//print(tree);
		return tree;
	}
	 
	public static  void add() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter new data ->");
		int data = scan.nextInt();
		tree.insert(data);
	}
	
	public static  void find() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter data to find ->");
		int data = scan.nextInt();
		if (tree.contains(data))
		   System.out.println("FOUND !!!");
		else 
			 System.out.println("NOT FOUND !!!");
	}
	
	public static void   remove() {
		Scanner scan =  new Scanner(System.in);
		rootTmp = null;
		System.out.println("Enter data to remove ->");
		int data = scan.nextInt();
		if (tree.delete(data,rootTmp)) {
		   System.out.println("DELETED  !!!");
		   tree = rootTmp;
		}
		else 
			 System.out.println("NOT FOUND !!!");
		tree.printInOrder();
	}
	

	public  static void  main (String[] args) {
		Scanner  scan = new Scanner(System.in);
		//TreeHandler tree =  new TreeHandler();
		//Node root =null;
		int opt=0;
		System.out.println("how many nodes->");
		int n = scan.nextInt();
		
		tree=populate(n);
		do {
		   System.out.println("0. end");
		   System.out.println("1. insert");
		   System.out.println("2. delete");
		   System.out.println("3. print pre order tree");
		   System.out.println("4. print in order tree");
		   System.out.println("5. print post order tree");
		   System.out.println("6. find value ");
		   System.out.println("7. copy  ");
		   System.out.println("Enter choice->");
		   opt = scan.nextInt();
		   switch (opt) {
		      case 1: add(); break;
		      case 2: remove(); break;
		      case 3: System.out.println("Root: "+tree.data);
		    	  tree.printPreOrder();System.out.println(); break;
		      case 4: System.out.println("Root: "+tree.data);
		    	  tree.printInOrder(); System.out.println();break;
		      case 5: System.out.println("Root: "+tree.data);
		    	  tree.printPostOrder();System.out.println();; break;
		      case 6: System.out.println("Root: "+tree.data);
	    	      find();System.out.println();; break;	
		      case 7:  tree.copy(treeCopy); 
		    	  System.out.println("Root copy: "+treeCopy.data);
    	          treeCopy.printInOrder();;System.out.println();; break;		    	      
		   }	

		} while (opt!=0) ;
		scan.close();
	}
}
