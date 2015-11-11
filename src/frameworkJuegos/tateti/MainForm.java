package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Juego;

public class MainForm 
{
	public static void main(String[] args)
	{
		Juego tateti = new JuegoTateti(new FactoryTateti());
		
		tateti.comenzar();
	}
}
