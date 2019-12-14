package fr.dauphine.ja.sidneydauvergne.iterables;

import java.util.*;

public class Panel extends AbstractList<Integer>{

	private final int beginning,end;
	
	Panel(int beginning, int end){
		this.beginning=beginning;
		this.end=end;
	}
	
	Panel(){
		this.beginning=0;
		this.end=0;
	}
	
	public Iterator<Integer> iterator() {
		return panel1(beginning,end);
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
	
	public static List<Integer> panel(int beginning, int end){
		return new Panel(beginning,end);
	}
	
	@Override
	public Integer get(int index) {
		return beginning+index;
	}

	@Override
	public int size() {
		return end-beginning+1;
	}
	
	public static void main( String[] args ){
		 Iterator<Integer> it = panel1(3,10); 
		 List<Integer> l = panel(3,6);
		 for(int i:l) {
			 System.out.println(i);
		 }
		 System.out.println(l.get(1));
		 System.out.println(l.size());
	}
	
}