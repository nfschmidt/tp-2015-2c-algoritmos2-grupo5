package algoritmos2.grupo5.frameworkJuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class UI
{
	public Jugador jugadorActual;
	Scanner scanner = new Scanner(System.in);
	public boolean esFinDeJuego = false;
	public Juego juego;
	public FactoryJuego factoryJugada;
	public Tablero tablero;
	public Resultado resultado;
	
	public void setFactoryJugada(FactoryJuego factory){
		this.factoryJugada = factory;
	}
	
	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	
	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	
	public void comenzar()
	{
		scanner=new Scanner(System.in);
	}

	public void cerrar()
	{
		scanner.close();
	}
	
	public int scanearValor()
	{
		boolean error= false;
		do
		{
			try
			{
				return scanner.nextInt();
			}
			catch (InputMismatchException ex)
			{
				imprimir("Eso no es un numero!!!!");
				scanner.next();
				error=true;
			}
		} while (error);
		return 0;
	}
	
	public String scanearCadena()
	{
		boolean error= false;
		do
		{
			try
			{
				System.out.print("Ingrese su jugada: ");
				return scanner.next();
			}
			catch (Exception ex)
			{
				imprimir("Pas� algo ac�!!!!");
				scanner.next();
				error=true;
			}
		} while (error);
		return "";
	}
	
	public void imprimir(String mensaje)
	{
		System.out.println(mensaje);
	}

	public void finDeJuego(Resultado resultado){
		this.actualizarVista(tablero);
		this.esFinDeJuego = true;		
		this.resultado = resultado;
		finalizarJuego();
	}
	
	public void proximoJugador(Jugador jugador){
		jugadorActual = jugador;			
	}
	
	//Metodo que escuchara las jugadas de cada jugador
	public void interactuar() {		
		while(! esFinDeJuego) {
			this.actualizarVista(this.tablero);
			
			String input = this.scanearCadena();
			
			Jugada jugada = this.factoryJugada.getJugada(jugadorActual, input);
			
			try {
				this.juego.jugar(jugada);
			} catch (JugadaInvalida e){
				imprimir("La jugada no es valida.");
			}
		}
	}
	
	public abstract void actualizarVista(Tablero tablero);

	public abstract void finalizarJuego();
	
}
