package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Graphics;
import java.awt.Shape;

public abstract class DrawableShape {

	Shape s;
	
	public void DrawableShape() {} ;
	
	
	/*public DrawableShape(Shape s) {
		this.s=s;
	}
	
	public void paintComponent(Graphics g) {
		System.out.println("dans shape");
		this.paintComponent(g);
	}*/
	
	public abstract void paintComponent(Graphics g);
	
}
