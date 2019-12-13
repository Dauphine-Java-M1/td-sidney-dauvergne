package fr.dauphine.ja.sidneydauvergne.iterables;

import java.util.*;

public class Panel implements Iterable<Integer>{

	public Iterator<Integer> iterator() {
		return panel1(0,0);
	}
	
	public static Iterator<Integer> panel1(int debut, int fin) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=debut;i<=fin;i++) {
			a.add(i);
		}
		return a.iterator();
	}
	
	public static void main( String[] args ){
		 Iterator<Integer> it = panel1(1,5); 
		 for(;it.hasNext();)
			 System.out.println(it.next());
	}
	
}