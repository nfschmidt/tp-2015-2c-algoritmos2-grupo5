package algoritmos2.grupo5.frameworkJuegos;

public abstract class Reglamento
{
	public abstract boolean esValida(int unaPosicion);
	public abstract boolean esFin();
	public abstract boolean esGanador();
	
	public abstract boolean validarJugada(Jugada jugada);
	public abstract boolean esFinDeTurno(Tablero tablero);
	
	public abstract Jugador obtenerJugadorInicial();
	public abstract Jugador proximoJugador();
}
