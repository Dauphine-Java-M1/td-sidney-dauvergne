package fr.dauphine.ja.sidneydauvergne.model;

import java.awt.Graphics;
import java.util.*;

import fr.dauphine.ja.sidneydauvergne.view.DrawableRing;

public class Ring extends Circle{

	int rayonI;
	
	Ring(Point centre, int r, int rayonI){
		if(rayonI<=r) {
			this.centre=centre;
			this.r=r;
			this.rayonI=rayonI;
		}
		else {
			System.out.println("Erreur. Le rayon interne doit être inférieur au rayon");
		}
	}
	
	public Ring (Circle c, int rayonI){
		this.centre = c.centre;
		this.r = c.r;
		this.rayonI = rayonI;
	}
	
	public Ring(){
		this.centre=new Point(0,0);
		r=0;
		rayonI=0;
	}
	
	public int getRayonI() {
		return rayonI;
	}
	
	public boolean equals(Ring a) {
		return this.centre.isSameAs(a.centre) && this.r==a.r && this.rayonI==a.rayonI;
	}
	
	public String toString() {
		return "Ring: \n" + new Circle(this.centre,this.r).toString()+" rayon interne: "+rayonI;
	}
	
	boolean contains(Point p) {
		if(new Circle(centre,r).contains(p) && !new Circle(centre,rayonI).contains(p)) {
			return true;
		}
		return false;
	}
	
	boolean contains(Point p, ArrayList<Ring> rings) {
		for (Ring r: rings) {
			if(r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	public void draw(Graphics g) {
		DrawableRing d = new DrawableRing(this);
		d.paintComponent(g);
	}
	
	public static void main(String[] args) {
//		Point p = new Point(0,0);
//		Ring rg= new Ring(p,5,4);
//		Ring rg1 = new Ring(p,6,7);
//		System.out.println(rg);
//		System.out.println(rg1);
//		
//		ArrayList<Ring> rings = new ArrayList<Ring>();
//		rings.add(rg);
//		rings.add(rg1);
//		System.out.println(rg.contains(new Point(5,3),rings));
//		
		
	}
	
}