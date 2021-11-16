
 class Circle {
	private int x,y,R;
	
	Circle() {
		x=y=0;
		R=1;
	}
	public Circle(int x, int y, int R) {
		this.x =x;
		this.y =y;
		this.R = R;
	}
	public int getX() { return x;}
	public int getY() { return y;}
	public int getR() { return R;}
	public void setX(int x) {this.x=x;}
	public void setY(int y) {this.y=y;}
	public void print() {
		System.out.println("[x,y,R]=[ "+x+", "+y+", "+R+"]");
	}
	public double area() {
		return this.getR()*this.getR()*Math.PI;
	}
}
