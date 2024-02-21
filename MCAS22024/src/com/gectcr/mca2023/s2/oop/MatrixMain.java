package com.gectcr.mca2023.s2.oop;

import java.util.Scanner;

public class MatrixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for row : ");
		int row = s.nextInt(); 
		System.out.println("Enter the value for columns : ");
		int cols = s.nextInt(); 
		Matrix m1 = new Matrix(row,cols);
		Matrix m2 = new Matrix(row,cols);
		Matrix m3 = new Matrix(row,cols);
		System.out.println("Enter the first Matrix");
		m1.read();
		System.out.println("The First Matrix is : \n"+m1);
		System.out.println("Enter the second Matrix");
		m2.read();
		System.out.println("The second Matrix is : \n"+m2);
		System.out.println("The Matrix 1 is a symmetricmatrix ?: "+m1.issymmetric()+"\n");
		System.out.println("The Matrix 2 is a symmetricmatrix ?: "+m2.issymmetric()+"\n");
		/*for(int i = 0;i<row;i++) {
			for(int j = 0;j<cols;j++) {
				m3.setAt(i, j, m1.getAt(i, j)+m2.getAt(i, j));
			}
		}*/
		m1.add(m2);
		System.out.println("The Added Matrix is : \n");
		System.out.println(m1);
		
		
	}

}
