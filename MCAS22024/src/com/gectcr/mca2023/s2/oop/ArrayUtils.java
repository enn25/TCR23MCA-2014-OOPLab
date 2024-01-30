package com.gectcr.mca2023.s2.oop;
import java.util.*;
public class ArrayUtils{
	int size;
	int a[];
	public ArrayUtils(int n){
		this.size = n;
		this.a = new int[n];
	}
	void EnterArr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS : ");
		for(int i=0;i<size;i++){
			a[i] = sc.nextInt();
		}
	}
	private void DisplayArr() {
		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}	
	}
	private void SearchArr(int value) {
		for(int i=0;i<size;i++){
			if(value == a[i]) {
				System.out.println("The ELement Is Found At position"+(i+1));
				break;
			}
		}
		System.out.println("The ELement Not Found");
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO.OF ELEMENT : ");
		int n = sc.nextInt();
		ArrayUtils obj1 = new ArrayUtils(n);
		obj1.EnterArr();
		int value;
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED : ");
		value = sc.nextInt();
		
		System.out.println("THE ELEMENT ENTERED : ");
		obj1.DisplayArr();
		obj1.SearchArr(value);
	}
	
	
	
	
}
