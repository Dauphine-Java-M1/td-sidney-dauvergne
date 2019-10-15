package fr.dauphine.ja.sidneydauvergne.shapes;

public class Ring extends Circle{

	int rayonI;
	
	Ring(Point centre, int r, int rayonI){
		this.centre=centre;
		this.r=r;
		this.rayonI=rayonI;
	}
	
	Ring(){
		this.centre=new Point(0,0);
		r=0;
		rayonI=0;
	}
	
	public boolean equals(Ring a) {
		return this.centre.isSameAs(a.centre) && this.r==a.r && this.rayonI==a.rayonI;
	}
	
	
	
}
