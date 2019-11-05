package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.model.Circle;
import fr.dauphine.ja.sidneydauvergne.model.Ring;

public class DrawableRing extends DrawableCircle {

	Ring r = new Ring();
	
	public DrawableRing(Ring r) {
		this.r=r;
	}
	
	public void paintComponent(Graphics g) {
//		System.out.println("dans ring");
//		System.out.println("1"+this);
		g.drawOval(r.getCenter().getX()-r.getRayon(), r.getCenter().getY()-r.getRayon(), r.getRayon()*2, 2*r.getRayon());
		//System.out.println("2"+this);
		g.drawOval(r.getCenter().getX()-r.getRayonI(), r.getCenter().getY()-r.getRayonI(), r.getRayonI()*2, r.getRayonI()*2);
	}
	
}
