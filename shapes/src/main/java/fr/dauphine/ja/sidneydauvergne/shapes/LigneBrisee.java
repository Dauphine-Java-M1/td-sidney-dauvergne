package fr.dauphine.ja.sidneydauvergne.shapes;

import java.util.*;

public class LigneBrisee {

	LinkedList<Point> ligne;
	
	LigneBrisee(){
		ligne = new LinkedList<Point>();
	}
	
	public String toString() {
		String res="";
		for(int i=0;i<this.ligne.size();i++) {
			res+=ligne.get(i).toString()+" ";
		}
		return res;
	}
	
	void add(Point p) {
		ligne.add(p);
	}
	
	/*int pointCapacity() {
		return ligne.size();
	}
	
	int nbPoints() {
		int i=0;
		int res=0;
		while(i<this.pointCapacity()&&ligne.get(i)!=null ) {res++; i++; }
		return res;
	}
	
	boolean contains(Point pt) {
		for(Point p : ligne) {
			if(p==null) {
				return false;
			}
			if(p.isSameAs(pt)==true) {
				return true;
			}
		}
		return false;
	}*/
	
	public static void main( String[] args ){
		Point p1=new Point(1,2);
		Point p2=new Point(3,2);
		Point p3=new Point(4,2);
		LigneBrisee l= new LigneBrisee();
		l.add(p1);
		l.add(p2);
		System.out.println(l);
		System.out.println(l.ligne.contains(p2));
		
    }
	
}
