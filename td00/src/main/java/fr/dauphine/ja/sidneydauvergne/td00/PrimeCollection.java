package fr.dauphine.ja.sidneydauvergne.td00;
import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection 
{	 
	ArrayList<Integer> numbers;
	
	PrimeCollection(){
		this.numbers= new ArrayList<Integer>();
	}
	
	public void initRandom(int n, int m) {
		Random r=new Random();
		for(int i=0; i<n; i++) {
			numbers.add(r.nextInt(m+1));
		}
		//System.out.println(numbers);
	}
	
	private boolean isPrime(int p) {
		if(p==2) {
			return false;
		}
		int i=2;
		while(i<=java.lang.Math.sqrt(p)) {
			if(p%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public void printPrimes() {
		int i=0;
		int x=this.numbers.get(i);
		while(i<this.numbers.size()) {
			if(Boolean.compare(this.isPrime(this.numbers.get(i)),true)==0) {
				System.out.println(this.numbers.get(i));
			}
			i++;
		}
	}
	
    public static void main( String[] args )
    {
        PrimeCollection x = new PrimeCollection();
        x.initRandom(100,3000);
        x.printPrimes();
        
    }
}
