package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.IJugada;
import algoritmos2.grupo5.frameworkJuegos.Reglamento;

public class ReglamentoTamagotchi extends Reglamento
{
	@Override
	public boolean esValida(int unaPosicion)
	{
		return false;
	}

	@Override
	public boolean esFin(IJugada unaJugada)
	{
		return false;
	}

	@Override
	public boolean esGanador(IJugada unaJugada)
	{
		return false;
	}

}
