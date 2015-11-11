package algoritmos2.grupo5.frameworkJuegos;

public interface FactoryJuego
{
	Jugada getJugada(Jugador jugador, String input);

	Reglamento getReglamento();

	Tablero getTablero();

	UI getUI();

	Jugador getJugador();
}
