package algoritmos2.grupo5.frameworkJuegos;


public class ReglamentoTateti extends Reglamento
{
	public boolean esValida(int unaPosicion)
	{
		if (unaPosicion != -1)
			return true;
		else
			return false;
	}
	
	public boolean esFin()
	{
		return true;
	}
	public boolean esGanador()
	{
		return true;
	}
}
