package com.ds;

public class TwodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] data = new int[3][3];
		
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 5;
		data[1][0] = 5;
		data[1][1] = 7;
		data[1][2] = 12;
		data[2][0] = 8;
		data[2][1] = 8;
		data[2][2] = 8;
		
		for(int i = 0;i < 3;i++){
			for(int j=0;j< 3;j++){
				//if(i==j)
				// above code for row == column
				System.out.print("\t" + data[i][j] +"\t");
			}
			System.out.println("\n");
		}
		
	}

}
