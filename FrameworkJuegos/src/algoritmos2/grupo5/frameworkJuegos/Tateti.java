package algoritmos2.grupo5.frameworkJuegos;

public class Tateti extends Juego
{ 
	static final int CANTIDAD_CASILLAS=9;
	private ReglamentoTateti miReglamento; 
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
		contadorCasillasOcupadas=0;
		setJugador1(new Jugador("O"));
		setJugador2(new Jugador("X"));
		tablero= new TableroTateti(5,5);
		miReglamento = new ReglamentoTateti();
		tablero.formatear();
		tablero.print();
	}

	public void jugar()
	{
		JugadaTateti unaJugada;
		while(!finalizo)
		{
		    unaJugada=new JugadaTateti(tablero,miReglamento);
			unaJugada.inicializar(); 
			contadorCasillasOcupadas = unaJugada.jugar(contadorCasillasOcupadas);
			finalizo = unaJugada.chequearFin(CANTIDAD_CASILLAS,contadorCasillasOcupadas);
		}
		cerrar();
	}

	public void jugadaRecibida(JugadaTateti jugada) 
	{
	}
	public void cerrar()
	{
	}
	public Jugador getJugador1()
	{
		return jugador1;
	}
	public void setJugador1(Jugador jugador1)
	{
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2()
	{
		return jugador2;
	}
	public void setJugador2(Jugador jugador2)
	{
		this.jugador2 = jugador2;
	}

}
