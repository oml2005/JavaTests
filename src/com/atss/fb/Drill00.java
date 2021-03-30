/*
 * 
 * 
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
 * 
 */


package com.atss.fb;


public class Drill00 {
	
	/*
	1
	11
	21
	1211   
	111221 
	312211 
	13112221
	1113213211
	31131211131221
	13211311123113112211   
	
1
11
2111
12312111

1112131112312111

31211112111331211112131112312111

	 */
	public static void lookFor() {
		System.out.println("running look");
		
		String str = "1";  
		while (str.length()<=100) {	
			System.out.println(str);
			String  tmp = "";
			char current  = str.charAt(0);		 
			for (int i=0;i<str.length();i++) {
			   int count =  0;  ;
			   current = str.charAt(i);	
			   for (int j=i;j<str.length();j++) {
				  char next = str.charAt(j);
			      if(next==current) 
				    count++;
			      else break;
			   };	
			   tmp = tmp + String.valueOf(count)+String.valueOf(current);
			}	
			System.out.println("");
			str=tmp;
			//str ="88888888888888888888888888888888888888888";
		}
		   
	}
	
   public static void main (String[] args) {
	   //conway();
	   lookFor();
   }
}
