package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class MyDisplay extends JPanel {

	public void paintComponent(Graphics g) {
		g.drawOval(100,100,100,100);	
		g.drawString("Cercle",300,100);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}
}