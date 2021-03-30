package com.atss.fb;

public class Conway {
	
	  static void pout(String s) {
		  System.out.println(s);
	  }
	
	  public static void lookforDebug(String init ) {        //2111 
		  pout("inicial "+init);						//1231
		  String sout = init;							//11121311
		  int  cycle = 0; 
		  while (sout.length()<20 && cycle < 10) {  
			  int  n = sout.length();  
			  pout("BEGIN cycle ;"+cycle+"    input "+sout +" scanning "+n+" symbols");
			  int i = 0;    
			  String stmp="";
			  while (i<n) {//  (i=0;i<n;i++) {
				  String symbol = sout.substring(i,i+1); 
				  pout("   current symbol :["+i+"]="+symbol);       //1
				  int  count = 0; 
				  int j = i;
				  while( j<n ) {
					  if(symbol.equals(sout.substring(j,j+1))) {
						 pout("                symbol ADDING:"+symbol); 
					     count++; j++;i++;
					 } else {
						i=j;
					    j=n;
					 }
			      } 
				  //i++;
				  stmp +=String.valueOf(count)+symbol;
				  pout("   Quantity :"+String.valueOf(count)+" of symbol "+symbol);
			  }
			  sout = stmp;    
			  pout("END cycle ;"+cycle+"                     output "+sout+"\n");cycle++;
		  } 	  
	  }
	  public static void lookfor(String init ) {        //2111 					//1231
		  String sout = init;							//11121311
		 
		  while (sout.length()<20 ) {  
			  int  n = sout.length();  
			  int i = 0;    
			  String stmp="";
			  String symbol = sout.substring(0,1); 
			  int  count = 0; 
			  for (i=0;i<n;i++) {	
				  if(symbol.equals(sout.substring(i,i+1))) 				  
					 count++; 				  		 
				  else {
					stmp +=String.valueOf(count)+symbol;  
					symbol = sout.substring(i,i+1); 
					count = 1; 
				  }			     				  
			  }; 
			  stmp +=String.valueOf(count)+symbol;   
			  pout(stmp);
			  sout = stmp;    		  
		 } 	  
	  }
	
	  public static void lookForOk(String init ) {        //2111 					//1231
		  String sout = init;							//11121311
		  
		  while (sout.length()<20 ) {  
			  int  n = sout.length();  
			  int i = 0;    
			  String stmp="";
			  while (i<n) {							   				  
				  String symbol = sout.substring(i,i+1); 
				  int  count = 0; 
				  int j = i;
				  while( j<n ) {
					  if(symbol.equals(sout.substring(j,j+1))) {
					     count++; i++; j++;
					 } else {
						i=j;
					    j=n;
					 }
			      }   
				  stmp +=String.valueOf(count)+symbol; 
			  }  
			  pout(stmp);
			  sout = stmp;    		  } 	  
	  }	  
	  
	  public static void serie(String input) {
		  System.out.println(input);
		  int n = input.length();  
		  while (n<100) {	  
			  String  s =  "";
			  String current = input.substring(0,1);
			  int count =  0;
			  for (int i=0;i<n;i++) {
				  if (input.substring(i,i+1).contentEquals(current)) 
					  count++;
				  else {
					  s += count+current;
					  current = input.substring(i,i+1);
					  count =  1;
				  }
			  }
			  s += count+current;
			  System.out.println(s);
			  input = s;
			  n = input.length();
		  }
		  
		  
	  }
	  
	public static void main (String [] argsv) {
		String init = "1";
		serie(init); 
		
	}
	
}
