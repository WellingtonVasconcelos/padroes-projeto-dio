package wellington.vasconcelos;

import wellington.vasconcelos.singleton.SingletonEager;
import wellington.vasconcelos.singleton.SingletonLazy;
import wellington.vasconcelos.singleton.SingletonLazyHolder;
import wellington.vasconcelos.strategy.Comportamento;
import wellington.vasconcelos.strategy.ComportamentoAgressivo;
import wellington.vasconcelos.strategy.ComportamentoDefensivo;
import wellington.vasconcelos.strategy.ComportamentoNormal;
import wellington.vasconcelos.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);		
		robo.mover();
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
		robo.mover();
		
		}
	}

