package com.gectcr.mca2023.s2.oop;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product(1000,125,"Pen");
		Product p2 = new Product(1230,50,"Can");
		Product p3 = new Product(1555,200,"Paint");
		System.out.println(p1+"\n"+p2+"\n"+p3);
		System.out.println("\n\n Largest Product is : "+Largest(p1,p2,p3));
		
		p3.setPrice(60);
		System.out.println("\nPrice 3 updated :"+p1);
		System.out.println("\n\n Largest Product is : "+Largest(p1,p2,p3));
		
	}
	
	public static Product Largest(Product p1,Product p2,Product p3) {
		double p1price = p1.getPrice();
		double p2price = p2.getPrice();
		double p3price = p3.getPrice();
		
		if(p1price > p2price && p1price > p3price) {
			return p1;
		}
		else if(p2price > p1price && p2price > p3price) {
			return p2;
		}
		else {
			 return p3;
		}
	}

}
