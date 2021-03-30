package com.atss.crazy;

import java.util.*;

public class  RomanLambda {
   private HashMap<Character,Integer> map;

   public RomanLambda(){
       map = new HashMap<Character,Integer>();
       map.put('I',1);       
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);                            
   }

   public int getVal(char c){
      if (map.containsKey(c))
         return map.get(c);
      else
         throw  new RuntimeException("Invalid symbol");
   }
  
   public  int decode(String roman) {
      int  n = roman.length();          // MMDXXCIV   2694
      int i,current,prev;
      int  value =      getVal(roman.charAt(n-1));
      for (i=n-2;i>=0;i--){
          current = getVal(roman.charAt(i));
          prev    = getVal(roman.charAt(i+1));
          if (current>=prev) 
             value +=current;      
          else 
             value -=current;      
      }      
      return value;
   }

   public static void main (String[] argsv) {
      System.out.println("Enter roman value ->");
      Scanner scan = new Scanner(System.in);
      String roman = scan.nextLine();
      System.out.println("Value enterd:"+roman+"  Dec:"+new RomanLambda().decode(roman.toUpperCase()));
   }
}
