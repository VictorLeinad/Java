package model.entides;

import model.exceptions.DomainException;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteretirada;
	
	public Conta(Integer numero, String titular, Double saldo, Double retirada) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteretirada = retirada;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getlimiteRetirada() {
		return limiteretirada;
	}
	
	public double deposito(double quantia) {
		return saldo += quantia;
	}
	
	public double saque (double quantia) {
		validacao(quantia);
		return saldo -= quantia;
	}
	
	public void validacao(double quantia){
		if (quantia > getlimiteRetirada()) {
			throw new DomainException("Erro de saque: A quantia excede o limite de saque");
		}
		if (quantia > getSaldo()) {
			throw new DomainException("Erro de saque: Saldo insuficiente");
		}
	}
	
	
}
