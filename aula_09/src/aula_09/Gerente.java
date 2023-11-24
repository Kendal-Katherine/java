package aula_09;

public class Gerente extends Funcionario implements CalcularSalario{
	
	private float bonus;
	
	public Gerente(String nome, int cargo, float salario, float comissao) {
		super(nome, cargo, salario);
		this.bonus = comissao;
	}

	public float getComissao() {
		return bonus;
	}

	public void setComissao(float comissao) {
		this.bonus = comissao;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.bonus);
	}

	@Override
	public float calcularSalario() {
		return this.getSalario() + this.bonus;
	}

}
