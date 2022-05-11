package padraojavaprojeto;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
		System.out.println(Singleton.getInstance());
		
	}

}
