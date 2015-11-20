package algoritmos2.grupo5.frameworkJuegos;

import java.util.ArrayList;
import java.util.List;

import algoritmos2.grupo5.frameworkJuegos.Reglamento;

public abstract class Juego {
	
	//Properties
	public Reglamento reglamento;
	public Tablero tablero;
	private UI ui;
	public List<Jugador> jugadores;
	protected Jugador jugadorActual;
	protected FactoryJuego factoryJuego;
	
	//Methods
	
	// Este metodo se puede sobrescribir segun lo que necesite hacer cada juego para inicializarse
	protected void inicializarValores() {}

	//Metodo Plantilla
	public Juego(FactoryJuego factoryJuego) {
		this.factoryJuego = factoryJuego;
		this.reglamento = factoryJuego.getReglamento();
		this.tablero = factoryJuego.getTablero();
		this.ui = factoryJuego.getUI();
		this.ui.setFactoryJugada(factoryJuego);
		
		ui.setJuego(this);
		ui.setTablero(tablero);
		
		this.jugadores = new ArrayList<Jugador>();
		
		this.inicializarValores();
	}
	
	public void comenzar() {
		this.jugadorActual = this.reglamento.obtenerJugadorInicial(this);
		ui.proximoJugador(jugadorActual);
		this.ui.interactuar();
	}
	
	public final void jugar(Jugada jugada) {					
		reglamento.validarJugada(jugada, this.tablero);
		
		jugada.ejecutar(this.tablero);
		
		if(!reglamento.esFin(this)) {
			this.jugadorActual = reglamento.proximoJugador(this);
			ui.proximoJugador(jugadorActual);
		}
		else {
			ui.finDeJuego(reglamento.obtenerResultado(this));
		}
	}

	public Jugador getJugadorActual() {
		return jugadorActual;
	}

	public List<Jugador> getJugadores() {
		return this.jugadores;
	}

	public Tablero getTablero() {
		return this.tablero;
	}
	
	public Jugador obtenerJugador(String ficha){
		for (Jugador jugador: this.jugadores){
			if (jugador.getFicha() == ficha)
				return jugador;
		}
		return null;
	}
}

