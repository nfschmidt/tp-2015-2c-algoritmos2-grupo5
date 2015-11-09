package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.IGameObject;
import algoritmos2.grupo5.frameworkJuegos.IJugada;
import algoritmos2.grupo5.frameworkJuegos.Juego;

public class JuegoTateti extends Juego
{ 
	//---getters  y setters-------------------------------------------
	public  String getCategoria()
	{
		return null;
	}
	public  String getNombre()
	{
		return "Ta-Te-Ti";
	}
	public  String getDescripcion()
	{
		return "Juego para dos jugadores donde gana el que consigue hacer linea primero";
	}
	
	public void inicializar()
	{		
		tablero = new TableroTateti();
		tablero.inicializar();
/*		tablero.imprimir();
		super.inicializar();
		super.listaAdd(tablero);*/
	}
	
	/*public void jugar()
	{
		IJugada unaJugada;
		do
		{
		    unaJugada = new JugadaTateti(super.getListaGameObjects());
			unaJugada.inicializar(); 
			unaJugada.jugar();	
		}while(!unaJugada.chequearFin());
		cerrar();
	}*/
	
	public void cerrar()
	{
	}
	

	@Override
	public void inicializarValores()
	{
		// TODO Auto-generated method stub
		
	}

}
