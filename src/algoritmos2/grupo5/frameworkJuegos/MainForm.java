package algoritmos2.grupo5.frameworkJuegos;

public class MainForm 
{
	public static void main(String[] args)
	{
		//JuegoManager.imprimirMenu();
		IJuego juegoSeleccionado= (IJuego)JuegoManager.factory("TAMAGOTCHI");
		juegoSeleccionado.inicializar();
		juegoSeleccionado.jugar(); 
		juegoSeleccionado.cerrar();
	}
}
