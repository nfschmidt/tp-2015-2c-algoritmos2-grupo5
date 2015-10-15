package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.Juego;

public class JuegoTamagotchi extends Juego
{
	private ReglamentoTamagotchi miReglamento; 
	private Tamagotchi tamagotchi;
	private boolean finalizo;
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
		setDirJuego("");
		finalizo = false;
		miReglamento = new ReglamentoTamagotchi();
		tamagotchi= new Tamagotchi();
		tamagotchi.inicializar(); 
	}
	
	public void jugar()
	{
		JugadaTamagotchi unaJugada;
		while(!finalizo)
		{
			unaJugada = new JugadaTamagotchi(miReglamento,tamagotchi);
			unaJugada.inicializar(); 
			unaJugada.jugar();
			finalizo = unaJugada.chequearFin();
		}
	}

	public void cerrar()
	{
	}

}
