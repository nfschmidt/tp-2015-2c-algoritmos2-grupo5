package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.IJugada;
import algoritmos2.grupo5.frameworkJuegos.Reglamento;

public class ReglamentoTateti extends Reglamento
{
	public boolean esValida(int unaPosicion)
	{
		if (unaPosicion != -1)
			return true;
		else
			return false;
	}
	
	public boolean esFin(IJugada unaJugada)
	{
		JugadaTateti jugada=(JugadaTateti)unaJugada;
		return (esGanador(jugada)|| hayEmpate(jugada));
	}
	public boolean esGanador(IJugada jugada)
	{
		return false;//agregar los casos en que alguien gana
	}
	public boolean hayEmpate(IJugada unaJugada)
	{
		JugadaTateti jugada=(JugadaTateti)unaJugada;
		int cantidadCasillas = jugada.getTablero().getCantidaCasillas();
		int contadorCasillas = jugada.getTablero().getContadorCasillasOcupadas();
		return (cantidadCasillas == contadorCasillas);
	}

}
