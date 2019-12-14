package fr.dauphine.ja.sidneydauvergne.iterables;

import java.util.*;

public class Mult {

	public Mult() {
		// TODO Auto-generated constructor stub
	}

	public static List<Integer> mult(int m, List<Integer> l) {
		int tmp;
		for(int i=0;i<l.size();i++) {
			tmp=l.get(i);
			l.set(i,tmp*m);
		}
		return l;
	}
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(Mult.mult(2,l));
	}
	
}
