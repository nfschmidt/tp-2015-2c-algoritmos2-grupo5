package algoritmos2.grupo5.frameworkJuegos;

public class Tablero
{
	private int filas;
	private int columnas;
	private String[][] tablero;
	public Tablero(int f, int c)
	{
		tablero = new String[f][c];
		filas=f;
		columnas=c;
	}
	public String[][] getTablero()
	{
		return tablero;
	}
	public int getPosicion(String unValor)
	{
		for(int i=0;i<filas;i++)
		{
			for(int j=0;j<columnas;j++)
			{
				//System.out.print(tablero[i][j]);
				if(tablero[i][j].equals(unValor))
				{
					return (i*10) + j;
				}
			}
		}
		return -1;
	}
	
	public void setCasilla(String valor, int f,int c)
	{
		tablero[f][c]= valor;
	}
	public void print()
	{
		for(int i=0;i<filas;i++)
		{
			for(int j=0;j<columnas;j++)
			{
				System.out.print(tablero[i][j]);
			}
			System.out.println("");
		}
	}
}
