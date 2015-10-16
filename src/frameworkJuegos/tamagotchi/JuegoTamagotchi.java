package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.IJugada;
import algoritmos2.grupo5.frameworkJuegos.Juego;

public class JuegoTamagotchi extends Juego
{
	private Tamagotchi tamagotchi;
	public  String getCategoria()
	{
		return "display lcd";
	}
	public  String getNombre()
	{
		return "Tamagotchi";
	}
	public  String getDescripcion()
	{
		return "Juego que permite criar a una mascota virtual";
	}
	public void inicializar()
	{
		tamagotchi= new Tamagotchi();
		tamagotchi.inicializar(); 
		tamagotchi.imprimir();
		super.inicializar();
		super.listaAdd(tamagotchi);
	}
	
	public void jugar()
	{
		IJugada unaJugada;
		do
		{
			unaJugada = new JugadaTamagotchi(super.getListaGameObjects());
			unaJugada.inicializar(); 
			unaJugada.jugar();
		}while(!unaJugada.chequearFin());
		cerrar();
	}

	public void cerrar()
	{
	}

}
