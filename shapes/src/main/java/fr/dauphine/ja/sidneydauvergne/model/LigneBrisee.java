package fr.dauphine.ja.sidneydauvergne.model;

import java.awt.Graphics;
import java.util.*;

import fr.dauphine.ja.sidneydauvergne.view.DrawableLine;

public class LigneBrisee extends Shape implements DrawableLine{

	LinkedList<Point> ligne;
	
	public LigneBrisee(){
		ligne = new LinkedList<Point>();
	}
	
	public String toString() {
		String res="";
		for(int i=0;i<this.ligne.size();i++) {
			res+=ligne.get(i).toString()+" ";
		}
		return res;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("dans ligne brisee");
		int n = ligne.size();
		int i=0;
		Point p,q;
		while(i<n-1) {
			System.out.println("dans while");
			p = ligne.get(i++);
			System.out.println(p);
			q = ligne.get(i);
			System.out.println(q);
			g.drawLine(p.getX(), p.getY(), q.getX(), q.getY());
		}
	}
	
	public void add(Point p) {
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