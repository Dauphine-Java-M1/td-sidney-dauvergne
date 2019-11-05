package fr.dauphine.ja.sidneydauvergne.model;

import java.awt.Graphics;
import java.util.*;
import fr.dauphine.ja.sidneydauvergne.view.*;

public class World{

	ArrayList<Shape> w;
	//MyDisplay d;
	
	public World() {
		w = new ArrayList<Shape>();
	}
	
	public ArrayList<Shape> getW(){
		return w;
	}
	
	public String toString() {
		String ch = new String();
		for (Shape s: w) {
			ch+=s.toString()+"\n";
		}
		return ch;
	}
	
	public void add(Shape s) {
		w.add(s);
	}
	
	public static void main(String[] args) {
		World world = new World();
		Point p1 = new Point(100,100);
		Point p2 = new Point(50,50);
		Point p3 = new Point (300,40);
		LigneBrisee l = new LigneBrisee();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		Circle c = new Circle(p1,10);
		Ring r = new Ring(c,6);
		//world.add(l);
		//world.add(r);
		world.add(c);
	}	
}
