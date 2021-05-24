package entidades;

public class PessoaJuridica extends Contribuintes {

	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double calculoImposto() {
		double soma = 0.0;
		if (funcionarios <= 10) {
			soma = super.getRendaAnual() * 0.16;
		} else {
			soma = super.getRendaAnual() * 0.14;
		}
		return soma;
	}
	
	

}
