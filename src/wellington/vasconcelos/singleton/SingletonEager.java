package wellington.vasconcelos.singleton;

/**
 * Singleton "apressado".
 * 
 * @author WellingtonVasconcelos
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
