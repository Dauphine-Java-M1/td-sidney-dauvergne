package fr.dauphine.ja.sidneydauvergne.shapes;

public class Circle {
	
	Point centre;
	int r; //rayon
	
	Circle(Point c, int r){
		this.centre=c;
		this.r=r;
	}
	
	Circle(){
		this.centre = new Point();
		this.r=0;
	}
	
	public String toString() {
		return "rayon: "+r+" et centre: "+centre;
	}
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Circle c = new Circle(p,1);
		System.out.println(c);
	}
	
}
