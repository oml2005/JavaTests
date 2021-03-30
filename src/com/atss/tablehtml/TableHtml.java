package com.atss.tablehtml;

public class TableHtml {

	public static void main(String[] str ) {
		String strRates = "5.0,100,5.5,101,6.0,102:L10;  5.0, 99,5.5,100,6.0,110:L20;";
		//               ----------------------------  ----------------------------

		String [] column = strRates.split(";");   
		// cols[0] = "5.0,100,5.5,101,6.0,102:L10"
		// cols[1] = "5.0, 99,5.5,100,6.0,110:L20"
		int m = column.length;   // m  columns

		String[] data   = new String[m];
		String[] labels = new String[m];


		String[] aux =   column[0].split(":");
		String[] tmp0 = aux[0].split(","); 
		int n = tmp0.length;  // rows


		System.out.println("columns m = "+m+"    rows n "+n);
		String[][] matrix =  new String[n][m];

        matrix[0][0] = "  ";
		for (int i=0;i<m;i++) {
			String[] tmp = column[i].split(":");
			labels[i] = tmp[1];
			data[i] = tmp[0];
			String [] pair = data[i].split(",");
			matrix[0][i] = labels[i]; 
			
			for(int j=0;j<n;j=j+2) 
				matrix[j][0] =pair[j] ;		
			int j=1;	
			while (j<n)  {						
					matrix[j][i] = pair[j]	;
				 j=j+2;
			}
		}  
		System.out.println("Final table :");
		for (int j=0;j<n;j++) {
			for (int i=0;i<m;i++)
				System.out.print(matrix[j][i]+"      ");
			System.out.println();
		}
	}



}


