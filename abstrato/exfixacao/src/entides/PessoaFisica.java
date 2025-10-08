package entides;

public class PessoaFisica extends TaxaPessoa{
	
	private Double gastossaude;
	
	public PessoaFisica(String nome, Double rendaanual, Double gastossaude) {
		super(nome, rendaanual);
		this.gastossaude = gastossaude;
	}

	@Override
	public double taxa() {
		if (super.getRendaanual() < 20000.00) {
			return (super.getRendaanual() * 0.15) - (gastossaude * 0.5);
		}
		else {
			return (super.getRendaanual() * 0.25) - (gastossaude * 0.5);
		}
	}
	
	
	
	
	
		
}
