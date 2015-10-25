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
	
	
	public abstract void ejecutarJugada(Jugada jugada);
	public abstract Jugador proximoJugador();
	
	//Jugar se comportaria como metodo plantilla. Las clases que extienden el metodo no lo redefinen.
	//Solo se redefinen los metodos internos
	public final void jugar(){		
		inicializar();
		
		Jugador jugadorActual = this.reglamento.obtenerJugadorInicial();
		Jugada jugadaActual = null;
		
		while (!reglamento.esFin()){
			
			//Jugador => ejecuta su jugada
			jugadaActual = jugadorActual.jugar();
			
			//Validacion de juego. Reglamento => validar tablero, devolver proximo jugador
			while (!reglamento.validarJugada(jugadaActual)){				
				jugadaActual = jugadorActual.jugar();				
			}
			
			//Ejecutar jugada
			this.tablero.ejecutarJugada(jugadaActual);
			//Es fin de juego?
			if(!reglamento.esFin()){
				//Obtengo proximo jugador
				jugadorActual = reglamento.proximoJugador();
			}
		}		
		cerrar();		
		
	}
	
	
}

