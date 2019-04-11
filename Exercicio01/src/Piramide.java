
public class Piramide extends Figura3d {
	
 private double base;
 private double prof;
 private double altura;
 
	public Piramide (double base, double prof, double altura) {
		this.base = base;
		this.prof = prof;
		this.altura = altura;
 
}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getProf() {
		return prof;
	}

	public void setProf(double prof) {
		this.prof = prof;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	double volume() {
		// TODO Auto-generated method stub
		return 
				getBase()*getProf()*getAltura();
	}
}