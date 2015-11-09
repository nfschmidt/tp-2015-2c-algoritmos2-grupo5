package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Tablero;
import algoritmos2.grupo5.frameworkJuegos.UI;

public class UITateti extends UI {
	protected JuegoTateti juego;

//	public void actualizar(Tablero tablero)
//	{
//		tablero.imprimir();
//	}

	public void cerrar()
	{
		imprimir("Me qued� sin casillas, termin� el juego");
		super.cerrar();
	}

	public void imprimirMenu()
	{
		imprimir("Elegi una casilla ingresando un numero entre el 1 y el 9"); 
	}

	@Override
	public void imprimirMenu(String[] unMenu)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void proximaJugada()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarJuego()
	{
		// TODO Auto-generated method stub
		
	}
}
