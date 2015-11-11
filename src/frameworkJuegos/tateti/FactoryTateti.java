package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.FactoryJuego;
import algoritmos2.grupo5.frameworkJuegos.Jugada;
import algoritmos2.grupo5.frameworkJuegos.Jugador;
import algoritmos2.grupo5.frameworkJuegos.Reglamento;
import algoritmos2.grupo5.frameworkJuegos.Tablero;
import algoritmos2.grupo5.frameworkJuegos.UI;

public class FactoryTateti implements FactoryJuego {

	@Override
	public Jugada getJugada(Jugador jugador, String input) {
		int fila = Integer.parseInt(input) / 3;
		int columna = Integer.parseInt(input) % 3;
		
		return new JugadaTateti((JugadorTateti)jugador, fila, columna);
	}

	@Override
	public Reglamento getReglamento() {
		return new ReglamentoTateti();
	}

	@Override
	public Tablero getTablero() {
		return new TableroTateti();
	}

	@Override
	public UI getUI() {
		return new UITateti();
	}

	@Override
	public Jugador getJugador() {
		return new JugadorTateti();
	}

}
