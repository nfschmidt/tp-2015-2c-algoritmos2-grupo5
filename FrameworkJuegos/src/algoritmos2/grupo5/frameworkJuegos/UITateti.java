package algoritmos2.grupo5.frameworkJuegos;

public class UITateti extends UI {
	protected Tateti juego;

	public void actualizar(Tablero tablero)
	{
		tablero.print();
	}

	public void cerrar()
	{
		imprimir("Me qued� sin casillas, termin� el juego");
		super.cerrar();
	}

	@Override
	public void imprimirMenu()
	{
		imprimir("Elegi una casilla ingresando un numero entre el 1 y el 9"); 
	}
}
