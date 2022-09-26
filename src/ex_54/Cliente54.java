package ex_54;

import ex_54.ContaBanco54;

public class Cliente54 {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBanco54 conta;
	
	public Cliente54() {
		
	}
	
	public Cliente54(int id, String nome, int idade, String email, ContaBanco54 conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		String dadosCliente = "Nome: " + this.nome +
				"\nIdade: " + this.idade;
		return dadosCliente;
	}
	
	public String exibirDadosConta() {
		String dadosConta = "Agencia: " + this.conta.agencia +
				"\nNumero: " + this.conta.numero + 
				"\nSaldo: " + this.conta.saldo;
		return dadosConta;		
	}
}