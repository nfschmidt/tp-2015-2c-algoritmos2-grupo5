package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.FactoryJuego;
import algoritmos2.grupo5.frameworkJuegos.Juego;

public class JuegoTateti extends Juego
{
	public JuegoTateti(FactoryJuego factoryJuego) {
		super(factoryJuego);
	}
	
	@Override
	protected void inicializarValores() {
		JugadorTateti jugador1 = (JugadorTateti) this.factoryJuego.getJugador();
		jugador1.setFIcha("X");
		
		JugadorTateti jugador2 = (JugadorTateti) this.factoryJuego.getJugador();
		jugador2.setFIcha("O");
		
		this.jugadores.add(jugador1);
		this.jugadores.add(jugador2);
	}
}
