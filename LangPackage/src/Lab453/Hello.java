package Lab453;

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
		if(this instanceof Cloneable){
			Hai hai = new Hai(this.hai.x);
			Hello h = new Hello(this.y,hai);
			return h;
		}
		else 
			throw new CloneNotSupportedException(getClass().getName());
	}

}
