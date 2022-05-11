package Facade;

public class Fachada {
	private UsuarioBanco usuario;
	private ContaBancaria conta;

	public Fachada() {
		this.usuario = new UsuarioBanco();
		this.conta = new ContaBancaria();
	}

	public void fazerDeposito(int quantidade, UsuarioBanco usuario, ContaBancaria conta){
		System.out.printf("Ol�, o benefici�rio de seu dep�sito � o(a) usu�rio %s\n",usuario.obterNomeDoUsuario());
		System.out.printf("Voc� escolheu a conta %s\n", conta.obterNumConta());
		System.out.printf("O saldo desta conta �: %d\n", conta.obterSaldo());
		System.out.printf("Voc� est� depositando R$ %s\n", quantidade);
		conta.setSaldo(conta.getSaldo() + quantidade);
		System.out.printf("Depositado R$ %d na conta de %s\n",quantidade, usuario.obterNomeDoUsuario());
		System.out.printf("O saldo desta conta �: R$ %s\n", conta.obterSaldo());
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
