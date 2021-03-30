package com.atss.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableGen {


	public static void main( String [] argsv)  {
		String strRates = "5.0,100,5.5,101,6.0,102:L10;5.0, 99,5.5,100,6.0,110:L20;";


		//ArrayList<String> Columns = new ArrayList<>();
		// To fixed-size list
		List<String> l = Arrays.asList(strRates.split(";"));

		String [] columns = strRates.split(";");
		int n = columns.length;
		String [] label = new String[n];
		String [] data =  new String[n];
		String [] pairs =  new String[n];
		String [][] matrix = new String[10][10];

		matrix[0][0] = "  ";
		int idxRow = 0;
		for (int  i=0;i<n;i++) {   // columnas	
			//System.out.println(" Columna  "+ columns[i]);
			data = columns[i].split(":");
			label[i] = data[1];
			pairs[i] = data[0];
			System.out.println("   label columna 0 :"+ label[i]);
			//System.out.println("   datos columna 0 pairs[i] :"+ pairs[i]);

			String [] arrData = pairs[i].split(",");


			int npairs =  arrData[i].length()*2;

			int j=0;  int idxCol ; 
			while (j<npairs) {
				idxCol=0;
				String rowValue = arrData[j];
				System.out.println("       row :"+ rowValue);
				j++;
				String colValue = arrData[j];
				System.out.println("       col :"+ colValue);
				j++;
				
				
				if (idxRow==0 && idxCol==0)
					matrix[idxRow][idxCol] = "  ";
				else {
					if (idxRow==0)
						matrix[idxRow][idxCol] = label[i];
					else {
						if (idxCol==0)
							matrix[idxRow][idxCol] = rowValue;
							else  	matrix[idxRow][idxCol] = colValue;
					}
				}
				idxCol++;	
			}
			idxRow++;
		}
		for (int i=0; i<10;i++) {
			for (int j=0;j<10;j++)
				System.out.print("   "+matrix[i][j]);System.out.println();
		}
		
		
	}

}
