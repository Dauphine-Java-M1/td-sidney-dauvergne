package fr.dauphine.ja.sidneydauvergne.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

import fr.dauphine.ja.sidneydauvergne.model.*;

public class MyDisplay extends JPanel {
	
	World world;
	
	public MyDisplay() {
		this. world = new World();
	}

	public MyDisplay(World w) {
		this.world = w;
	}
	
	public void paintComponent(Graphics g) {
		//g.drawOval(100,100,100,100);	
		//g.drawString("Cercle",300,100);
		
		for (Shape s: this.world.getW()) {
			System.out.println("ok");
			s.paintComponent(g);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		World world = new World();
		Point p1 = new Point(100,100);
		Point p2 = new Point(50,50);
		Point p3 = new Point (300,40);
		LigneBrisee l = new LigneBrisee();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		System.out.println(l);
		Circle c = new Circle(p1,200);
		Circle c1= new Circle(p3,200);
		Ring r = new Ring(c1,195);
		world.add(l);
		world.add(r);
		world.add(c);
		System.out.println(world);
		
		MyDisplay d = new MyDisplay(world);
		System.out.println("avant add");
		frame.add(d);
		
		
		
		
		
	}
}