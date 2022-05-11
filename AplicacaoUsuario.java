package Facade;

public class AplicacaoUsuario {
	public static void main(String[] args) {
		UsuarioBanco usuario = new UsuarioBanco("Dayane Xavier de Lira");
		ContaBancaria conta = new ContaBancaria("0310-7");

		Fachada facade = new Fachada();
		facade.fazerDeposito(750, usuario, conta);
	}

}
