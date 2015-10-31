package algoritmos2.grupo5.frameworkJuegos;

public abstract class Reglamento
{
	public abstract boolean esValida(int unaPosicion);
	public abstract boolean esFin();
	public abstract boolean esGanador();
	
	public final void validarJugada(Jugada jugada){
		if(!jugadaValida(jugada)){
			throw new JugadaInvalida();
		}
	}
	
	public abstract boolean jugadaValida(Jugada jugada);
	public abstract boolean esFinDeTurno(Tablero tablero);
	
	public abstract Jugador obtenerJugadorInicial();
	public abstract Jugador proximoJugador();
}
