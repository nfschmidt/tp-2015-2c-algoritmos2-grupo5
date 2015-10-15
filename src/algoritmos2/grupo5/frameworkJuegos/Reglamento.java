package algoritmos2.grupo5.frameworkJuegos;

public abstract class Reglamento
{
	public abstract boolean esValida(int unaPosicion);
	public abstract boolean esFin(IJugada jugada);
	public abstract boolean esGanador(IJugada jugada);
}
