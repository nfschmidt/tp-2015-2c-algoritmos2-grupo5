package algoritmos2.grupo5.frameworkJuegos;

import algoritmos2.grupo5.frameworkJuegos.Reglamento;

public abstract class Juego {
	
	//Properties
	public Reglamento reglamento;
	public Tablero tablero;
	private String dirJuego; //path del directorio donde se ubican los recursos del juego en caso de tener alguno
	private UI ui;
	
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

	//Definir los parametros iniciales para cada juego puntual
	public abstract void inicializarValores();

	//Metodo plantilla
	public final void inicializar(Reglamento reglamento, Tablero tablero, UI ui){
		this.reglamento = reglamento;
		this.tablero = tablero;
		this.ui = ui;
		ui.setJuego(this);
		
		this.inicializarValores();
	}
	
	//Jugar se comportaria como metodo plantilla. Las clases que extienden el metodo no lo redefinen.
	//Solo se redefinen los metodos internos
	public final void jugar(Jugada jugada){					
										
		//Validacion de juego. Reglamento => validar tablero
		reglamento.validarJugada(jugada, this.tablero);
		
		//Ejecutar jugada
		jugada.ejecutar(this.tablero);
		
		//Es fin de juego?
		if(!reglamento.esFin()){
			//Obtengo proximo jugador, lo envio a la interfaz
			ui.proximoJugador(reglamento.proximoJugador());
		}
		else
		{
			ui.finDeJuego();
		}
	}
	
	
}

