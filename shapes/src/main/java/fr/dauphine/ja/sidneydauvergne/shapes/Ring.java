package fr.dauphine.ja.sidneydauvergne.shapes;

public class Ring extends Circle{

	int rayonI;
	
	Ring(Point centre, int r, int rayonI){
		if(rayonI<=r) {
			this.centre=centre;
			this.r=r;
			this.rayonI=rayonI;
		}
		else {
			System.out.println("Erreur. Le rayon interne doit être inférieur au rayon");
		}
	}
	
	Ring(){
		this.centre=new Point(0,0);
		r=0;
		rayonI=0;
	}
	
	public boolean equals(Ring a) {
		return this.centre.isSameAs(a.centre) && this.r==a.r && this.rayonI==a.rayonI;
	}
	
	public String toString() {
		return new Circle(this.centre,this.r).toString()+" rayon interne: "+rayonI;
	}
	
	/*boolean contains(Point p) {
		
	}*/
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Ring rg= new Ring(p,1,3);
		System.out.println(rg);
	}
	
}
