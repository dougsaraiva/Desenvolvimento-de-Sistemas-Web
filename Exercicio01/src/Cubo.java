
public class Cubo extends Figura3d {
	
	
private double tamanho;
	
	public Cubo(double tamanho) {
		this.tamanho = tamanho;
	}	

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 
				3*getTamanho();
	}

	

}
