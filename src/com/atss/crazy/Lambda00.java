package com.atss.crazy;

public class Lambda00 {   // 0


interface IntMath  {
	public int arithmetic(int a,int b);
};



private int calcula(int a,  int b, IntMath oper){
   return oper.arithmetic(a,b);	
}


public static void main (String[] argsv) {
   Lambda00 funcion = new Lambda00();
   IntMath sum = (a,b)->a+b;
   IntMath sub = (a,b)->a+b;
   IntMath mul = (a,b)->a*b;
   IntMath div = (int a,int b)-> {
      if (b!=0) 
        return a/b;
      return 0;
   };

   System.out.println("Suma 3,4"+ funcion.calcula(3,4,sum));

	
}


}  //   0
