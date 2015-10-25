package algoritmos2.grupo5.frameworkJuegos;

public abstract class Juego {
	
	//Properties
	public Reglamento reglamento;
	public List<Jugador> jugadores;
	public Tablero tablero;
	private String dirJuego; //path del directorio donde se ubican los recursos del juego en caso de tener alguno
	
	
	//Methods	
	public String getDirJuego()
	{
		return dirJuego;
	}
    public void setDirJuego(String path)
    {
    	this.dirJuego = path;
    }
    
	public abstract String getCategoria();//la categoria me permite agrupar por tipo de juego, para poder armar un menu por ejemplo
	public abstract String getNombre();//nombre del juego que se ve en el menu
	public abstract String getDescripcion();
	public abstract void inicializar();
	public abstract void cerrar();
	public abstract void jugar();//este seria el que llama a las jugadas
	
	public abstract void ejecutarJugada(Jugada jugada);
	public abstract Jugador proximoJugador();
	
	
}

