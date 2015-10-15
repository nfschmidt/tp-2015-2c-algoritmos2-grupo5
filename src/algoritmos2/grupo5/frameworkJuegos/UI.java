package algoritmos2.grupo5.frameworkJuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class UI implements IUI
{
	Scanner scanner;
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
	public abstract void imprimirMenu(String[] unMenu);
}
