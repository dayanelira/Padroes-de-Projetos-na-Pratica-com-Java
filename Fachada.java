package Facade;

public class Fachada {
	private UsuarioBanco usuario;
	private ContaBancaria conta;

	public Fachada() {
		this.usuario = new UsuarioBanco();
		this.conta = new ContaBancaria();
	}

	public void fazerDeposito(int quantidade, UsuarioBanco usuario, ContaBancaria conta){
		System.out.printf("Olá, o beneficiário de seu depósito é o(a) usuário %s\n",usuario.obterNomeDoUsuario());
		System.out.printf("Você escolheu a conta %s\n", conta.obterNumConta());
		System.out.printf("O saldo desta conta é: %d\n", conta.obterSaldo());
		System.out.printf("Você está depositando R$ %s\n", quantidade);
		conta.setSaldo(conta.getSaldo() + quantidade);
		System.out.printf("Depositado R$ %d na conta de %s\n",quantidade, usuario.obterNomeDoUsuario());
		System.out.printf("O saldo desta conta é: R$ %s\n", conta.obterSaldo());
	}

	public UsuarioBanco getUsuario() {
		return usuario;
	}

	public void setCliente(UsuarioBanco usuario) {
		this.usuario = usuario;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

}
