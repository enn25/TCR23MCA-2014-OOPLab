package com.gectcr.mca2023.s2.oop;

public class Product1 {
	private String pname;
	private long pcode;
	private double price;
	
	Product1(long pcode,String pname,double price){
		this.price=price;
		this.pname=pname;
		this.pcode=pcode;
	}
	
	public String toString() {
		return "Product ---> [Product name : "+pname+", Product Code : "+pcode+", Product price : "+price+"]";	
	}
	
	public double getPrice(){return price;}
	
	public void setPrice(double cost) {
		price = cost;
	}
}
