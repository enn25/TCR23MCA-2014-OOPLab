package com.gectcr.mca2023.s2.oop;
import java.util.*;
public class ArrayUtils{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO.OF ELEMENT : ");
		int n = sc.nextInt();
		AllFunArr obj1 = new AllFunArr(n);
		obj1.EnterArr();
		int value;
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED : ");
		value = sc.nextInt();
		
		System.out.println("THE ELEMENT ENTERED : ");
		obj1.DisplayArr();
		obj1.SearchArr(value);
	}
	
	
	
	
}
