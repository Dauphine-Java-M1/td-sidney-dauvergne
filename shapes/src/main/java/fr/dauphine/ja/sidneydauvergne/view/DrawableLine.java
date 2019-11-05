package fr.dauphine.ja.sidneydauvergne.view;
import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.model.LigneBrisee;
import fr.dauphine.ja.sidneydauvergne.model.Point;

public class DrawableLine extends DrawableShape {
	
	LigneBrisee l = new LigneBrisee();

	public DrawableLine(LigneBrisee l) {
		this.l = l;
	}
	
	//public void draw() {
		//this.paintComponent();
	//}
	
	public void paintComponent(Graphics g) {
		//System.out.println("dans ligne brisee");
		int n = this.l.getLigne().size();
		int i=0;
		Point p,q;
		while(i<n-1) {
			//System.out.println("dans while");
			p = l.getLigne().get(i++);
			//System.out.println(p);
			q = l.getLigne().get(i);
			//System.out.println(q);
			g.drawLine(p.getX(), p.getY(), q.getX(), q.getY());
		}
	}
	
}
