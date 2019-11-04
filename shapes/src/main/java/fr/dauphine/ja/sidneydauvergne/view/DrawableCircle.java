package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.model.Circle;

public interface DrawableCircle extends DrawableShape{
	
	Circle c = new Circle();
		
	public void paintComponent(Graphics g);

}
