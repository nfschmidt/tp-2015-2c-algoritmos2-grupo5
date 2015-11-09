package algoritmos2.grupo5.frameworkJuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class UI
{
	public Jugador jugadorActual;
	Scanner scanner;
	public boolean esFinDeJuego = false;
	public Juego juego;
	public FactoryJugada factoryJugada;
	public Tablero tablero;
	
	//Abstract methods
	public abstract void imprimirMenu(String[] unMenu);
	public abstract void proximaJugada();
	public abstract void finalizarJuego();
	
	public void setFactoryJugada(FactoryJugada factory){
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
				imprimir("Pasó algo acá!!!!");
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


	
	public void finDeJuego(){
		this.esFinDeJuego = true;		
		finalizarJuego();
	}

	
	public void proximoJugador(Jugador jugador){
		jugadorActual = jugador;			
	}
	
	//Metodo que escuchara las jugadas de cada jugador
	public void interactuar(){
		
		while(!esFinDeJuego){
			tablero.print();
			String input = this.scanearCadena();
			Jugada jugada = this.factoryJugada.getJugada(input);
			
			try {
				this.juego.jugar(jugada);
			} catch (JugadaInvalida e){
				imprimir("La jugada no es valida.");
			}
		}
	}
	
	public final void imprimir(Tablero tablero){
		String grilla = "";
		String separador = "";
		for(int i = 0; i < tablero.getFilas() -1; i++){
			for(int j = 0; j < tablero.getColumnas() -1; i++){
				grilla = grilla + " " + tablero.grilla[i][j];
				
				if(j < tablero.getColumnas() - 1){
					grilla = grilla + " |";
				}
				else{
					grilla = grilla + " ";
				}
				separador += "----";
			}
			grilla = grilla + '\n';
			if (i < tablero.getFilas() - 1 ){
				grilla = grilla + separador + '\n';
			}
		}
	}
	
}
