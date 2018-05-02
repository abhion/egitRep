package com.pac.interf;

public class Person {
	void purchase() {
		Flipkart f = new Flipkart();
		f.sell("ab",2323,"adrs");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.purchase();
	}
}
