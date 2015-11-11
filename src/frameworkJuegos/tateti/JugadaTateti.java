package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Jugada;
import algoritmos2.grupo5.frameworkJuegos.Tablero;

public class JugadaTateti implements Jugada
{
	private int fila;
	private int columna;
	JugadorTateti jugador;
	
	public JugadaTateti(JugadorTateti jugador, int fila, int columna) {
		this.jugador = jugador;
		this.fila = fila;
		this.columna = columna;
	}
	
	@Override
	public void ejecutar(Tablero tablero) {
		tablero.setCasilla(fila, columna, jugador.getFicha());
	}
	
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}
}

