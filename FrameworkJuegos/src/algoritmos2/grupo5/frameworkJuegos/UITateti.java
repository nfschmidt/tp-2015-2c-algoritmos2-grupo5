package algoritmos2.grupo5.frameworkJuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UITateti implements UI {
	protected Tateti juego;
	Scanner scanner;
	
	public void comenzar()
	{
		scanner=new Scanner(System.in);

		
//		while(! juego.finalizo())
//		{
//			System.out.println("Elegi una casilla ingresando un numero entre el 1 y el 9");
//			Scanner scanner = new Scanner(System.in);
//			scanner.close();
//
//			int posicion = scanner.nextInt();
//			
//			if (posicion >= 1 && posicion <= 9)
//			{
//				JugadaTateti jugada = new JugadaTateti(posicion);
//				this.juego.jugadaRecibida(jugada);
//			} else {
//				System.out.println("Ese numero no, elige otro");
//			}
//		}
	}

	public void actualizar(Tablero tablero)
	{
		tablero.print();
	}
	public void cerrar()
	{
		imprimir("Me qued� sin casillas, termin� el juego");
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
	
	public void imprimir(String mensaje)
	{
		System.out.println(mensaje);
	}
}
