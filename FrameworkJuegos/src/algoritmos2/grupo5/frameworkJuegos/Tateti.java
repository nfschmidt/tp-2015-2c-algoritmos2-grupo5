package algoritmos2.grupo5.frameworkJuegos;

import java.util.Scanner;

public class Tateti extends Juego
{
	private Tablero tablero = new Tablero(5,5);
	private int numeroCasillas=9;
	private int contadorCasillas=0;
	private String caracter;
	private boolean finalizo=false;
	
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
		Jugador jugador1=new Jugador();
		Jugador Jugador2=new Jugador();
		
		int contador=1;
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (i%2==0) 
					{
						String valorCasilla=Integer.toString(contador);
						if (j%2==0) 
							{
								tablero.setCasilla(valorCasilla,i,j);
								contador++;
							}
						else tablero.setCasilla("|",i,j);
					}
				else tablero.setCasilla("-",i,j);
			}
		}
		tablero.print();
	}
	
	public  void cerrar()
	{
		System.out.println("Me qued� sin casillas, termin� el juego");
	}
	private boolean chequearFin(int NumeroCasillas,int contadorCasillas)
	{
		return  (NumeroCasillas==contadorCasillas);
	}
	public void jugar()
	{
		Scanner scanner=new Scanner(System.in);
		int numero;
		int unValor;
		while(!finalizo)
		{
			System.out.println("Elegi una casilla ingresando un numero entre el 1 y el 9");
			numero=scanner.nextInt();
			unValor=tablero.getPosicion(Integer.toString(numero));
			if (unValor != -1)
			{
				if (contadorCasillas%2==0)
				caracter ="O";
				else
				caracter ="X";	
				tablero.setCasilla(caracter,unValor/10,unValor % 10);
				tablero.print();
				contadorCasillas++;
				finalizo= chequearFin(numeroCasillas,contadorCasillas);
			}
			else
				System.out.println("Ese numero no, eleg� otro");
		}
		cerrar();
		scanner.close();
	}
	
	public boolean finalizo() {
		return false;
	}
	

}
