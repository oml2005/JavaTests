// Given a list of words and an alphabet, determine whether the list 
// of words is sorted given the alphabet.

// words = ['cad', 'bad', 'dab']
// alphabet = ['a', 'b', 'c', 'd'] ==> False
// alphabet = ['c', 'b', 'a', 'd'] ==> True

// Clarifications:
// - We want to determine if the list of words is sorted, not the individual words.
// - The words in the list may not all be the same length.
// - All characters in the list of words are in the alphabet.
// - There are no duplicates in the alphabet.

// 'cad' 'cbb'
// 021 011
// Compare 'c' vs 'c' 0 vs 0
// Compare 'a' vs 'b' 2 vs 1 False

package com.atss.fb;

import java.util.*;

public class FbExam {
	public static boolean compare(String str1, String str2, String alphabet) {	   
		   HashMap <Character,Integer> map=  new HashMap<Character,Integer>();
    	   boolean result  =  false;
		   for  (int i=0;i<alphabet.length();i++) {	     	   
		         char c = alphabet.charAt(i);
		         map.put(c,i);
		   };
		   // str1 bad
		   // str2 cad
		   
		   for (int i=0;i< str1.length();i++) {
		       char c =  str1.charAt(i);                // c  = b  1 	       
		       for  (int j=0; j<str2.length();j++)  {   //     
		           char t = str2.charAt(j);             // t  = c  2
		           System.out.println("   comparing "+c+ " vs " +  t+"...");           
		           if (c!=t)
		             if (map.get(c) <  map.get(t) ) {    // 1  <  2 
		        	   System.out.println("      "+c+" lower than "+t+" :sorted ok");
		               result = true; return result;  
		             } else if (map.get(c) >  map.get(t)){  
		        	   System.out.println("      "+c+" bigger than "+t+" :sorted not ok");
		               result = false ; return result;     
		             }	           
		       }		       
		   }
		   return result ;
		   
		   //  ok
		   /*
		   for (int i=0;i< str1.length();i++) {
		       char c =  str1.charAt(i);                // c  = b  1 	       
		       for  (int j=0; j<str2.length();j++)  {   //     
		           char t = str2.charAt(j);             // t  = c  2	           		           
		             System.out.println("   comparing "+c+ " vs " +  t+"...");
		             if (map.get(c) <=  map.get(t) ) {    // 1  <  2 
		        	   System.out.println("      "+c+" lower than "+t+" :sorted ok");
		               result = true; return result; //break;
		             } else {  
		        	   System.out.println("      "+c+" bigger than "+t+" :sorted not ok");
		               result = false ; return result; // break;    	             
		           }
		       }	// j	       
		   }  // i
		   return result ;
		   */
		  
		
		   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] words = {"cbad", "cbad", "cbad"};
				
		boolean listSorted =true;
		int  i = 0;
		while( i< words.length) {
			for  (int j=i+1;j<words.length;j++) {	
			System.out.println("------------ Sorting "+words[i]+ " respect to " +  words[j]);
			   if (compare(words[i],words[j],alphabet)) {
			      System.out.println(words[i]+" sorted "+ " respect to " +  words[j]);
			   } else {
		    	  System.out.println(words[i]+" not sorted "+ "respect to "+words[j]);	
		          listSorted = false ;break;
		       };
			}
		    if (listSorted)
		         i++;
		    else break;
		}
		if (listSorted) 
			System.out.println("List sorted");
		else 
	         System.out.println("list  not sorted");
	}
}
