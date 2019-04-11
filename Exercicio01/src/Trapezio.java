
public class Trapezio extends Figura2d {

	private double baseMenor;
	private double baseMaior;
	private double altura;
	
	
	public Trapezio (double baseMenor, double baseMaior, double altura) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
	}

	public double getbaseMenor() {
		return baseMenor;
	}

	public void setbaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getbaseMaior() {
		return baseMaior;
	}

	public void setbaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 
				((getbaseMenor() + getbaseMaior()) * getAltura()) 	/ 2;
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
		
	}
	
}