package fr.dauphine.ja.sidneydauvergne.view;
import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.model.LigneBrisee;

public interface DrawableLine extends DrawableShape {
	
	LigneBrisee l = new LigneBrisee();

	public void paintComponent(Graphics g);
	
}
