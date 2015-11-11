package algoritmos2.grupo5.frameworkJuegos;

public abstract class Reglamento
{
	public abstract boolean esFin(Juego juego);
	
	public final void validarJugada(Jugada jugada, Tablero tablero){
		if(! jugadaValida(jugada, tablero)) {
			throw new JugadaInvalida();
		}
	}
	
	public abstract boolean jugadaValida(Jugada jugada, Tablero tablero);
	
	public abstract Jugador obtenerJugadorInicial(Juego juego);
	public abstract Jugador proximoJugador(Juego juego);
	public abstract Resultado obtenerResultado(Juego juego);

}
