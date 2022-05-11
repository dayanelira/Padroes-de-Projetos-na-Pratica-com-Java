package Facade;

public class UsuarioBanco {
	private String nome;

	public String obterNomeDoUsuario(){
		return this.nome;
	}

	public UsuarioBanco(){}

	public UsuarioBanco(String nome){
		this.nome = nome;
		
	}

}
