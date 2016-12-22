package com.p1;

public class Hello {
	/*protected int ab = 99;
	protected void m1(){
		System.out.println("Hello m1()");*/
	
	
	String name;
	int age;
	
	public Hello(String name, int age){
	this.name=name;
	this.age=age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Hello){
			Hello h = (Hello)obj;
			return this.name.equals(h.name) && this.age == h.age;
		}
		return false;
	}
	public static void main(String[] args) {
		//Hai h1 = new Hai();
		//System.out.println(h1.ab);
		//h1.show();
		
		
		Hello h1= new Hello("saket" , 21);
		Hello h2=new Hello("saket",21);
		System.out.println("result "+ h1.equals(h2));
		
		
	}
}
