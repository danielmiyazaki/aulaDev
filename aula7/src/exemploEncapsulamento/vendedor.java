package exemploEncapsulamento;

public class vendedor extends funcionario{
	private double comissao;
	private String turno;
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getComissao() {
		return this.comissao;
	}
	public String getTurno() {
		return this.turno;
	}
}
