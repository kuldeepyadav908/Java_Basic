package Lab452;

class Hello implements Cloneable {
	int y;
	Hai hai;
	Hello(int y,Hai hai){
		this.y = y;
		this.hai = hai;
	}
	void show(){
		System.out.println("Hello->y: "+y);
		System.out.println("Hai->hai: "+hai.x);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
