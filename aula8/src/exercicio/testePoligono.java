package exercicio;

public class testePoligono {
	
	public static void main(String[] args) {

		triangulo t = new triangulo();
		quadrado q = new quadrado();
		retangulo r = new retangulo();
		
		System.out.println(t.calcularArea(5,6));
		System.out.println(q.calcularArea(4, 5));
		System.out.println(r.calcularArea(7, 9));
		
		
	}
}
