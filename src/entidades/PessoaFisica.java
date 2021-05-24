package entidades;

public class PessoaFisica extends Contribuintes {

	private Double gastoComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	
	public Double getGastoComSaude() {
		return gastoComSaude;
	}
	
	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}
	
	@Override
	public double calculoImposto() {
		double soma = 0.0;
		if (super.getRendaAnual() < 20000.00) {
			soma = (super.getRendaAnual() * 0.15) - (gastoComSaude * 0.50);
		} else {
			soma = (super.getRendaAnual() * 0.25) - (gastoComSaude * 0.50);
		}
		return soma;
	}

}
