package fr.dauphine.ja.sidneydauvergne.model;

import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.view.DrawableShape;

public abstract class Shape  implements DrawableShape{

	Point p;
	
	public void paintComponent(Graphics g) {
		System.out.println("dans shape");
		this.paintComponent(g);
	}
	
}
