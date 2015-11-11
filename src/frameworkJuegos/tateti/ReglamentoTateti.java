package frameworkJuegos.tateti;

import java.util.List;

import algoritmos2.grupo5.frameworkJuegos.Juego;
import algoritmos2.grupo5.frameworkJuegos.Jugada;
import algoritmos2.grupo5.frameworkJuegos.Jugador;
import algoritmos2.grupo5.frameworkJuegos.Reglamento;
import algoritmos2.grupo5.frameworkJuegos.Resultado;
import algoritmos2.grupo5.frameworkJuegos.Tablero;

public class ReglamentoTateti extends Reglamento
{
	@Override
	public boolean jugadaValida(Jugada jugada, Tablero tablero) {
		JugadaTateti jugadaTateti = (JugadaTateti) jugada;
		return tablero.getCasilla(jugadaTateti.getFila(), jugadaTateti.getColumna()) == " ";
	}

	@Override
	public Jugador obtenerJugadorInicial(Juego juego) {
		return juego.getJugadores().get(0);
	}

	@Override
	public Jugador proximoJugador(Juego juego) {
		List<Jugador> jugadores = juego.getJugadores();
		if (juego.getJugadorActual() == jugadores.get(0)) {
			return jugadores.get(1);
		}
		
		return jugadores.get(0);
	}
	
	@Override
	public boolean esFin(Juego juego) {
		TableroTateti tablero = (TableroTateti) juego.getTablero();
		
		return hayTatetiVertical(tablero) ||
				hayTatetiHorizontal(tablero) ||
				hayTatetiDiagonal(tablero);
	}

	
	
	private boolean hayTatetiDiagonal(TableroTateti tablero) {
		if (tablero.getCasilla(0, 0) != " " &&
				tablero.getCasilla(0, 0) == tablero.getCasilla(1, 1) &&
				tablero.getCasilla(0, 0) == tablero.getCasilla(2, 2)) {
			return true;
		}
		else if (tablero.getCasilla(0, 2) != " " &&
				tablero.getCasilla(0, 2) == tablero.getCasilla(1, 1) &&
				tablero.getCasilla(0, 2) == tablero.getCasilla(2, 0)) {
		}
		
		return false;
	}

	private boolean hayTatetiHorizontal(TableroTateti tablero) {
		for (int fila = 0; fila < tablero.getFilas(); fila ++) {
			if (tablero.getCasilla(fila, 0) != " " &&
					tablero.getCasilla(fila, 0) == tablero.getCasilla(fila, 1) &&
					tablero.getCasilla(fila, 0) == tablero.getCasilla(fila, 2)) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean hayTatetiVertical(TableroTateti tablero) {
		for (int columna = 0; columna < tablero.getFilas(); columna ++) {
			if (tablero.getCasilla(0, columna) != " " &&
					tablero.getCasilla(0, columna) == tablero.getCasilla(1, columna) &&
					tablero.getCasilla(0, columna) == tablero.getCasilla(2, columna)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Resultado obtenerResultado(Juego juego) {
		return new Resultado();
	}

}
