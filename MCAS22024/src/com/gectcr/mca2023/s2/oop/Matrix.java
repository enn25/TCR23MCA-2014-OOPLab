package com.gectcr.mca2023.s2.oop;
import java.util.Scanner;

public class Matrix {
	private int row;
	private int cols;
	private int store[][];
	public Matrix(int row,int cols) {
		this.row = row;
		this.cols = cols;
		this.store = new int [row][cols];
	}
	
	public int getAt(int i, int j) {
		return store[i][j];
	}
	
	public void setAt(int i, int j,int value) {
		store[i][j] = value;
	}
	
	public String toString() {
		String  str = "[ \n";
		for(int i =0;i<row;i++) {
			for(int j =0;j<cols;j++) {
				str = str + store[i][j] +" ";
			}
			str = str + "\n";
		}
		str = str + "]";
		return str;
	}
	
	public void read() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				store[i][j]=s.nextInt();
			}
		}
	}
	
	public void add(Matrix m) {
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<cols;j++) {
				store[i][j] += m.getAt(i, j);
			}
			}
		}
	public boolean issymmetric() {
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<cols;j++) {
				if(store[i][j] != store[j][i]) {
					return false;
			}
			}
	}
		return true;
	}
}

