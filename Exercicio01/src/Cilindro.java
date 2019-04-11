public class Cilindro extends Figura3d {

	private double altura;
	private double raio;
	
	public Cilindro (double altura, double raio) {
		this.altura = altura;
		this.raio = raio;
		
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	double volume() {
	
		return
				Math.PI *  Math.pow(getRaio(), 3) * getAltura();
	}

}
