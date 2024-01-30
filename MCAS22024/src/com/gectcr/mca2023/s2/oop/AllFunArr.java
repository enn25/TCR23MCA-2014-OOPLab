package com.gectcr.mca2023.s2.oop;

import java.util.Scanner;

public class AllFunArr {
	int size;
	int a[];
	public AllFunArr(int n){
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
	public void DisplayArr() {
		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}	
	}
	public void SearchArr(int value) {
		for(int i=0;i<size;i++){
			if(value == a[i]) {
				System.out.println("The ELement Is Found At position"+(i+1));
				break;
			}
		}
		System.out.println("The ELement Not Found");
	}
	
}
