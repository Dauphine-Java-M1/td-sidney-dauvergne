package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Graphics;

import fr.dauphine.ja.sidneydauvergne.model.Ring;

public interface DrawableRing extends DrawableCircle {

	Ring r = new Ring();
	
	public void paintComponent(Graphics g);
	
}
