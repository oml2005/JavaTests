package com.atss.fb;

public class Fibo {
	
	static int n1 =0; static int n2=1; static int n3;
	
	public static void fibo(int limite) {	
		if (limite>0) {	
			n3 = n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(n3+" , ");
			fibo (limite-1);
		} else 
			return;
		
	}
	
	// 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144 , 233 .
	// 0 , 1, 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144 , 233 , 377 , 
	public static void main (String [] args) {
		int limite = 15;
	
		System.out.print("0 , 1, ");
		fibo(limite-2);
		
		
	}

	
}
