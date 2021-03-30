package com.atss.fb;

public class Hanoi {
    static final int matrixSize = 80;
    static final int tamanoDisco= 5;
    static final int DISCOS = 3;
    
    static char [][] matrix = new char [matrixSize][matrixSize]; 
    static int [] top = new  int [3];
    static int [][] torre = new  int [3][DISCOS];
    static int paso =  0;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hanoi hanoi =  new Hanoi();
   
       
        for (int i=0;i<3;i++) 
           for (int j=0;j<DISCOS;j++)
        	   if (i==0)
    		       torre[i][j]=DISCOS-j;
        	   else
        		   torre[i][j]=0;

      
       top[0]=DISCOS; top[1]=top[2]=0;
       System.out.println("initial state :  ");printNumbers();
       int discos = DISCOS;
       //printMatrix();
       
       hanoi.torresHanoi(discos, 0, 1, 2);
       /*
Mover disco de torre 1 a  torre 3
Mover disco de torre 1 a  torre 2
Mover disco de torre 3 a  torre 2
Mover disco de torre 1 a  torre 3
Mover disco de torre 2 a  torre 1
Mover disco de torre 2 a  torre 3
Mover disco de torre 1 a  torre 3
        * 
        */
	}
    static  void printMatrix() {
    	for (int i=0;i<80;i++) {
    		for (int j=0;j<80;j++)
    			System.out.print(matrix[i][j]);
    		System.out.println();
    	}
    }

	
	static void printNumbers() {
		char [] digit = {' ','1','2','3'};
		int []base =  {5,30,55};	
		int ren =  matrixSize;
		for (int i=0;i<3;i++) { 
			System.out.print("Torre "+(i+1)+" :"+top[i]+"  ");
			for (int j=0;j<15;j++) 
				System.out.print(" "); 	   
		}
		System.out.println();
		char [] row = new  char[matrixSize];
		for  (int level=0;level<DISCOS ;level++) {
		int j ;
		for  (j=0;j<3;j++) {	
			  int i; int c = (torre[j][level]); 
			  for (  i=0;i<matrixSize;i++) row[i]=' '; // clear row
			  int k;
			  for ( k=0;k<tamanoDisco*torre[j][level];k++) 
			    	row[(base[j]+k)]= '*';	
			  row[base[j]+k] =  digit[c] ;
		      //for ( i=0;i<matrixSize;i++)System.out.print(row[i]); 	System.out.println();
		      for (i=0;i<matrixSize;i++) matrix[ren-1][i] = row[i];
		  }	  ren--;
		   System.out.println();
		}	printMatrix();
	}
		
	public void torresHanoi(int discos,  int origen, int auxiliar,  int  destino) {
		if (discos==1) {
			System.out.println("Paso  "+(++paso)+" Mover disco de torre "+origen+" a "+" torre "+destino);
			//System.out.println("DISCOS == 1 "); printNumbers();
			 top[origen]--;			
			 torre[destino][top[destino]]=torre[origen][top[origen]];
			 torre[origen][top[origen]]=0;			 
			 top[destino]++;
		} else {    
			//  8  0  1  2
			//     7  0  0     top
			torresHanoi(discos-1,origen,destino,auxiliar);
			System.out.println("Paso  "+(++paso)+" Mover disco de torre "+origen+" a "+" torre "+destino);
			//System.out.println("    DISCOS  -1 paso interno  1 ");printNumbers();
			top[origen]--; 		 
			torre[auxiliar][top[auxiliar]]=torre[origen][top[origen]];	
			torre[origen][top[origen]]=0;	
			top[auxiliar]++;
			printNumbers();
			torresHanoi(discos-1,auxiliar,origen,destino);
			top[auxiliar]--; 

				 
			torre[destino][top[destino]]=torre[auxiliar][top[auxiliar]];
			torre[auxiliar][top[auxiliar]]=0;
		    top[destino]++;			
			printNumbers();
		}	
	}
}
