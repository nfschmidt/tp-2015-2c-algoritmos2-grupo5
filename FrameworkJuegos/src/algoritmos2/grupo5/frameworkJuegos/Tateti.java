package algoritmos2.grupo5.frameworkJuegos;

public class Tateti extends Juego
{
	private UITateti ui;
	private ReglamentoTateti miReglamento; 
	private int cantidadCasillas;
	private int contadorCasillasOcupadas;
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	private boolean finalizo;
	private TableroTateti tablero; 
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
		setDirJuego("");
		finalizo=false;
		cantidadCasillas=9;
		contadorCasillasOcupadas=0;
		jugador1=new Jugador("O");
		jugador2=new Jugador("X");
		ui= new UITateti();
		ui.comenzar();
		tablero= new TableroTateti(5,5);
		miReglamento = new ReglamentoTateti();
		tablero.formatear();
		tablero.print();
	}
	
	public void jugar()
	{
		int unValor;
		while(!finalizo)
		{
			JugadaTateti unaJugada=new JugadaTateti(tablero,miReglamento);
			ui.imprimir("Elegi una casilla ingresando un numero entre el 1 y el 9");  
		    unValor =ui.scanearValor();
			if (unaJugada.validar(unValor))
			{
				unaJugada.jugar(contadorCasillasOcupadas);
				ui.actualizar(tablero);
				contadorCasillasOcupadas++;
				finalizo= unaJugada.chequearFin(cantidadCasillas,contadorCasillasOcupadas);
			}
			else
				ui.imprimir("Ese numero no, elegi otro");
		}
		cerrar();
	}

	public boolean finalizo() 
	{
		return false;
	}
	public void jugadaRecibida(JugadaTateti jugada) 
	{
	}
	public void cerrar()
	{
	}

}
