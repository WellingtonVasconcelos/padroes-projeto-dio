package wellington.vasconcelos;

/**
 * Singleton "LazyHolder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referecia</a>
 * 
 * @author WellingtonVasconcelos
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
