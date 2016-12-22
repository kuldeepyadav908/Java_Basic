package com.jlcindia.spring;

public class Hello {
	

	private A aobj;		//S.I
	private B bobj;		//C.I
	
	public void setAobj(A aobj) {
		System.out.println("Hello -> setAobj");
		this.aobj = aobj;
	}
	
	public Hello(B bobj) {
		System.out.println("Hello -> 1 args");
		this.bobj = bobj;
	}
	public void show(){
		System.out.println("show in Hello");
		aobj.showA();
		bobj.showB();
	}
	
}
