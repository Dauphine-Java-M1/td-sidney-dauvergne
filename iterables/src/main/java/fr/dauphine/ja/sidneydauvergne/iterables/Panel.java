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
	
	
	public static void main( String[] args ){
		 Iterator<Integer> it = panel1(3,10); 
		 for(;it.hasNext();)
			 System.out.println(it.next());
	}
	
}