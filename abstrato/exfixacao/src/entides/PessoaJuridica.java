package entides;

public class PessoaJuridica extends TaxaPessoa{
	
	private Integer func;

	public PessoaJuridica(String nome, Double rendaanual, Integer func) {
		super(nome, rendaanual);
		this.func = func;
	}

	public Integer getFunc() {
		return func;
	}

	public void setFunc(Integer func) {
		this.func = func;
	}

	@Override
	public double taxa() {
		if (func <= 10) {
			return super.getRendaanual() * 0.16;
		} else {
			return super.getRendaanual() * 0.14;
		}
	}
	
	
	
	
	
}
