package com.atss.crazy;
//import org.springframework.stereotype.Component;

class Lambda01 {
	
    interface IntMath {
         int perform (int a, int b);
    };

    private int execute(int a, int b, IntMath oper) {
         return oper.perform(a,b);
    };

	public static void main(String[] argsv) {
	   Lambda01 object =  new Lambda01();
 	   IntMath add = (int a, int b) ->   a+b;
 	   IntMath sub  = (a,b) ->    a-b;

 	   System.out.println("add, 3,4 = "+object.execute(3,4,add));
 	   System.out.println("sub, 4,3 = "+object.execute(4,3,sub));
	}
}