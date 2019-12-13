package fr.dauphine.ja.sidneydauvergne.iterables;

import java.util.*;

public class Panel implements Iterable<Integer>{

	//private int beginning,end;
	
	public Iterator<Integer> iterator() {
		return panel1(0,0);
	}
	
	public static Iterator<Integer> panel1(final int beginning, final int end) {
		return new Iterator<Integer>() {
			int cursor = beginning;
			
			public boolean hasNext() {
				if (cursor<=end) {
					return true;
				}
				return false;
			}
			
			public Integer next() {
				return cursor++;
			}
		};
			
	}
	
	public static ArrayList<Integer> panel2(int beginning, int end) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=beginning;i<=end;i++) {
			a.add(i);
		}
		return a;
	}
	
	public static void main( String[] args ){
		 Iterator<Integer> it = panel1(3,10); 
		 for(int i:panel2(1,5)) {
			 System.out.println(i);
		 }
	}
	
}