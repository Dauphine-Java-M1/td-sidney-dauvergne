package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.model.Circle;

public class DrawableCircle extends DrawableShape{
	
	Circle c = new Circle();
		
	public DrawableCircle() {
		c = new Circle();
	}
	
	public DrawableCircle(Circle c) {
		this.c=c;
	}
	
	public void paintComponent(Graphics g) {
		//System.out.println("dans circle");
		g.drawOval(c.getCenter().getX()-c.getRayon(), c.getCenter().getY()-c.getRayon(), 2*c.getRayon(),2*c.getRayon());
	}

}
