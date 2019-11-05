package fr.dauphine.ja.sidneydauvergne.model;

import java.math.*;
import java.awt.*;
import java.util.*;

import fr.dauphine.ja.sidneydauvergne.view.*;

public class Circle extends Shape{
	
	Point centre;
	int r;
	
	public Circle(Point c, int r){
		this.centre=c;
		this.r=r;
	}
	
	public Circle(){
		this.centre = new Point();
		this.r=0;
	}
	
	public String toString() {
		return "Cercle:\n rayon: "+r+" et centre: "+centre+" surface: "+this.surface();
	}
	
	void translate(int dx, int dy) {
		this.centre=this.centre.translate(dx,dy);
	}
	
	public Point getCenter() {
		return this.centre;
	}
	
	public int getRayon() {
		return this.r;
	}
	
	double surface() {
		return Math.PI*this.r*this.r;
	}
	
	boolean contains(Point p) {
		int res=(p.getX()-this.centre.getX())*(p.getX()-this.centre.getX())+(p.getY()-this.centre.getY())*(p.getY()-this.centre.getY());
		if(res<r*r) {
			return true;
		}
		return false;
	}
	
	static boolean contains(Point p, ArrayList<Circle> circles) {
		for (Circle c: circles) {
			if (c.contains(p)){
				return true;
			}
		}
		return false;
	}
	
	public void draw(Graphics g) {
		DrawableCircle d = new DrawableCircle(this);
		d.paintComponent(g);
	}
	
	public static void main(String[] args) {
//		Point p = new Point(1,2);
//		Circle c1 = new Circle(p,1);
//		//System.out.println(c);
//		
//		Circle c2 = new Circle(p,2);
//		c2.translate(1, 1);
//		
//		//System.out.println(c1+" "+c2);
//		
//		Circle c = new Circle(new Point(1,2),1);
//		c.getCenter().translate(1, 1);
//		//System.out.println(c);
//		
//		Point p1 = new Point(3,4);
//		Circle c3 = new Circle(new Point(0,0),5);
//		//System.out.println(c3.contains(p1));
//		
//		ArrayList<Circle> circles = new ArrayList<Circle>();
//		circles.add(c1);
//		circles.add(c3);
//		System.out.println(Circle.contains(new Point(1,2),circles));
	}
	
}