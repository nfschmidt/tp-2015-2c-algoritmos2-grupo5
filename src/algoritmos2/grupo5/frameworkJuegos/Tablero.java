package algoritmos2.grupo5.frameworkJuegos;

public abstract class Tablero extends GameObject
{
	private int filas;
	private int columnas;
	private String[][] tablero;

	public void dimTablero(int f, int c)
	{
		tablero = new String[f][c];
	}

	public int getPosicion(String unValor)
	{
		for(int i=0;i<filas;i++)
		{
			for(int j=0;j<columnas;j++)
			{
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
	public void imprimir()
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
	
	public abstract void inicializar();
	
	
	
	//-----getters y setters----------------------------------------
	public void setFilas(int filas)
	{
		this.filas = filas;
	}
	public void setColumnas(int columnas)
	{
		this.columnas = columnas;
	}
	public String[][] getTablero()
	{
		return tablero;
	}
}
