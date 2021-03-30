package trees;

public class Node {
	int data;
	Node  left ;
	Node right ;
	
	public Node(int data) {
		this.data =  data;
	}
	
	public boolean contains(int value) {
		   if (data==value) {
			  return true;
		   } else {
			   if  (value<data) {
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
	
	
	public    boolean  delete(int  value, Node rootTmp) {		
		boolean result = false;
		if (left!=null)
			   left.delete(value,rootTmp);
		   System.out.println("comparing node "+data+"  vs value "+value);
		   if ((data==value)) {
			   result = true;
			   System.out.println("     ----------------------found ");
		   } else {
			   System.out.println("     -------------------------- inserting "+data);
			   if (rootTmp==null) {
				  rootTmp = new Node(this.data);
				  System.out.println("     -------------------------- root  "+data);
			   }
			   else	   
			      rootTmp.insert(data);
			   System.out.println("copy in progress :");
			   rootTmp.printInOrder();
		   }	   
		   if (right!=null)
		       right.delete(value, rootTmp);			
		return result;
		
	}
	
	public   void printInOrder() {
		if (this!=null) {
	   	   if (left!=null)
			   left.printInOrder();
		   System.out.print(data+", ");
		   if (right!=null)
		       right.printInOrder();
		}  else 
			System.out.println("Empty tree");
	} 
	
	
	
	public void printPreOrder() {
		if  (this!=null) {
			System.out.print(data+", ");
			if (left!=null) 
				left.printPreOrder();
			if (right!=null)
				right.printPreOrder();
		}else 
			System.out.println("Empty tree");
	}
		
	public void printPostOrder() {
			if  (this!=null) {
				if (left!=null) 
					left.printPostOrder();
				if (right!=null)
					right.printPostOrder();
				System.out.print(data+", ");
			}  else 
				System.out.println("Empty tree");
	}	
		
	public   void copy(Node treeCopy) {
		if (this!=null) {
	   	   if (left!=null)
			   left.printInOrder();
		   System.out.print("copying "+data+", ");
		   if (treeCopy==null)
			   treeCopy =  new Node(data);
		   else	   
		      treeCopy.insert(data);
		   if (right!=null)
		       right.printInOrder();
		}  else 
			System.out.println("Empty tree");
	} 
	
	public void insert(int value) {	
		Node node =  new Node(value);
           if (value <=data) { 
        	   if (left==null) {
        		   left=node;    		   
        	   }   
        	   else
        		   left.insert(value);
           } else {
        	   if (right==null) {
        		   right=node;
        	   } else
        		   right.insert(value); 		   
           }
	}
}
