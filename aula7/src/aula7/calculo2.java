package aula7;

public class calculo2 {

	private double numero1;
	private double numero2;
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public double getNumero1() {
		return this.numero1;
	}
	public double getNumero2() {
		return this.numero2;
	}
	
	void exibirSoma() {
		System.out.println(this.numero1+this.numero2);
	}
	public double exibirSoma2() {

		return (getNumero1()+getNumero2());
	}
}
