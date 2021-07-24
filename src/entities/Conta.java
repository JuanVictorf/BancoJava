package entities;

public class Conta {
	
	public String nome;
	public double saldo;
	public double deposito;
	public double saque;
	
	
	public double adicionarSaldo() {
		return saldo + deposito;
	}
	
	public double retiraSaldo() {
		return adicionarSaldo() - saque;
	}
	
	
	
}
