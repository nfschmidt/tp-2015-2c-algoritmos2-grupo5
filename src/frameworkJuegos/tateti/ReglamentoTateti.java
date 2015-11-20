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
		JuegoTateti juegoTateti = (JuegoTateti)juego;
		
		return hayTatetiVertical(juegoTateti) ||
				hayTatetiHorizontal(juegoTateti) ||
				hayTatetiDiagonal(juegoTateti) || juego.getTablero().estaCompleto();
	}

	
	
	private boolean hayTatetiDiagonal(JuegoTateti juego) {
		return obtenerGanadorDiagonal(juego) != null;
	}

	private boolean hayTatetiHorizontal(JuegoTateti juego) {
		return obtenerGanadorHorizontal(juego) != null;
	}
	
	private boolean hayTatetiVertical(JuegoTateti juego) {
		return obtenerGanadorVertical(juego) != null;
	}

	@Override
	public Resultado obtenerResultado(Juego juego) {		
		JuegoTateti juegoTateti = (JuegoTateti)juego;
		if(this.hayTatetiVertical(juegoTateti)){
			return new Resultado(this.obtenerGanadorVertical(juegoTateti));
		}
		
		if(this.hayTatetiHorizontal(juegoTateti)){
			return new Resultado(this.obtenerGanadorHorizontal(juegoTateti));
		}
		
		if(this.hayTatetiDiagonal(juegoTateti)){
			return new Resultado(this.obtenerGanadorDiagonal(juegoTateti));
		}
		
		return new Resultado();
	}
	
	
	public Jugador obtenerGanadorVertical(JuegoTateti juego){
		
		TableroTateti tablero = (TableroTateti)juego.getTablero();		
		
		for (int columna = 0; columna < tablero.getFilas(); columna ++) {
			if (tablero.getCasilla(0, columna) != " " &&
					tablero.getCasilla(0, columna) == tablero.getCasilla(1, columna) &&
					tablero.getCasilla(0, columna) == tablero.getCasilla(2, columna)) {
				return juego.obtenerJugador(tablero.getCasilla(0, columna));
			}				
		}
		return null;
	}
	
	
public Jugador obtenerGanadorHorizontal(JuegoTateti juego){
		
		TableroTateti tablero = (TableroTateti)juego.getTablero();		
		
		for (int fila = 0; fila < tablero.getFilas(); fila ++) {
			if (tablero.getCasilla(fila, 0) != " " &&
					tablero.getCasilla(fila, 0) == tablero.getCasilla(fila, 1) &&
					tablero.getCasilla(fila, 0) == tablero.getCasilla(fila, 2)) {
				return juego.obtenerJugador(tablero.getCasilla(fila, 0));
			}
		}		
		return null;
	}


public Jugador obtenerGanadorDiagonal(JuegoTateti juego){
	
	TableroTateti tablero = (TableroTateti)juego.getTablero();		
	
	if (tablero.getCasilla(0, 0) != " " &&
			tablero.getCasilla(0, 0) == tablero.getCasilla(1, 1) &&
			tablero.getCasilla(0, 0) == tablero.getCasilla(2, 2)) {
		return juego.obtenerJugador(tablero.getCasilla(0, 0));
	}
	else if (tablero.getCasilla(0, 2) != " " &&
			tablero.getCasilla(0, 2) == tablero.getCasilla(1, 1) &&
			tablero.getCasilla(0, 2) == tablero.getCasilla(2, 0)) {
		return juego.obtenerJugador(tablero.getCasilla(0, 2));
	}
	
	return null;
}

}
