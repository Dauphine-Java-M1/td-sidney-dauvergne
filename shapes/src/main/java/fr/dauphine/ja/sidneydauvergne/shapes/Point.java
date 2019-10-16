package fr.dauphine.ja.sidneydauvergne.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point {
	
	private int x,y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	Point(Point p){
		this.x=p.x;
		this.y=p.y;
	}
	
	Point(){
		this.x=0;
		this.y=0;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	boolean isSameAs(Point p) {
		if (this.x==p.x && this.y==p.y) {
			return true;
		}
		return false;
	}
	
	public Point translate(int dx, int dy) {
		return new Point(dx,dy);
	}
	
	int getX() {
		return this.x;
	}
	
	int getY() {
		return this.y;
	}
	
	int indexOf(ArrayList<Point> l) {
		int i=0;
		for (Point p: l) {
			if(p.isSameAs(this)) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
    public static void main( String[] args )
    {
        Point p1 = new Point(1,2);
        Point p2=p1;
        Point p3= new Point(1,2);
        
        System.out.println(p1.isSameAs(p2));
        System.out.println(p1.isSameAs(p3));
        
        ArrayList<Point> list = new ArrayList<Point>();
        list.add(p1);
        System.out.println(p2.indexOf(list));
        System.out.println(p3.indexOf(list));
        
    }
}
