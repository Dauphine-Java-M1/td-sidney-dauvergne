package fr.dauphine.ja.sidneydauvergne.shapes;

import java.math.*;

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
		return "rayon: "+r+" et centre: "+centre+" surface: "+this.surface();
	}
	
	void translate(int dx, int dy) {
		this.centre=this.centre.translate(dx,dy);
	}
	
	Point getCenter() {
		return this.centre;
	}
	
	double surface() {
		return Math.PI*this.r*this.r;
	}
	
	/*boolean contains(Point p) {
		
	}*/
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Circle c1 = new Circle(p,1);
		//System.out.println(c);
		
		Circle c2 = new Circle(p,2);
		c2.translate(1, 1);
		
		System.out.println(c1+" "+c2);
		
		Circle c = new Circle(new Point(1,2),1);
		c.getCenter().translate(1, 1);
		System.out.println(c);
	}
	
}
