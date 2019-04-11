
import java.util.ArrayList;
public class Geometria {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(5);
		Quadrado q1 = new Quadrado(5);
		Retangulo r1 = new Retangulo(5, 10);
		Trapezio tr1 = new Trapezio(5,10,4);
		Triangulo t1 = new Triangulo(15, 30);
		
		
		
		ArrayList<Figura2d> f2d = new ArrayList();
		
		
		f2d.add(c1);
		f2d.add(q1);
		f2d.add(r1);
		f2d.add(t1);
		f2d.add(tr1);
		
		for (Figura2d figura2d : f2d) { 
			
			System.out.println("Area: " + figura2d.area());
			System.out.println("Perimetro: " + figura2d.perimetro());
		}
		
		ArrayList<Figura3d> f3d = new ArrayList();
		
		
		Cubo cu1 = new Cubo(5);
		Cilindro ci1 = new Cilindro (10,5);
		Esfera es1 = new Esfera (20,5);
		Piramide pi1 = new Piramide (2,2,2);
		
		f3d.add(cu1);
		f3d.add(ci1);
		f3d.add(es1);
		f3d.add(pi1);
		
		
		for (Figura3d figura3d : f3d) {
			System.out.println("Volume: "+ figura3d.volume());
			
		}
	}

}
