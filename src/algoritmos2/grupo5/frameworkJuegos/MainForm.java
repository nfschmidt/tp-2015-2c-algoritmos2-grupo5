package algoritmos2.grupo5.frameworkJuegos;

import frameworkJuegos.tateti.JuegoTateti;
import frameworkJuegos.tateti.TableroTateti;
import frameworkJuegos.tateti.UITateti;

public class MainForm 
{
	public static void main(String[] args)
	{
		Juego juego = new JuegoTateti();
		UITateti ui = new UITateti();
		juego.tablero = new TableroTateti();
		ui.imprimir(juego.tablero);
		
		//JuegoManager.imprimirMenu();
		//IJuego juegoSeleccionado= (IJuego)JuegoManager.factory("TAMAGOTCHI");
//		juegoSeleccionado.inicializar();
//		juegoSeleccionado.jugar(); 
//		juegoSeleccionado.cerrar();
	}
}
