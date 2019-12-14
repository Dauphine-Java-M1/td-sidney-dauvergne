package fr.dauphine.ja.sidneydauvergne.generics;

/**
 * Hello world!
 *
 */
public class Maximums {
	
	public static int myMax(Integer...integers ) {
		int max = integers[0];
		for(int i: integers) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	
    public static void main( String[] args ){
        System.out.println(myMax(42,1664));
        System.out.println(myMax(2014,86,13));
        System.out.println(myMax());
    }
}
