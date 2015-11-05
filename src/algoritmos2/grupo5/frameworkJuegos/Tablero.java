package algoritmos2.grupo5.frameworkJuegos;

public abstract class Tablero
{
	public int filas;
	public int columnas;
	public String[][] grilla;
	public Tablero()//(int f, int c)
	{
	//	tablero = new String[f][c];
//		filas=f;
//		columnas=c;
	}
	public void setFilas(int filas)
	{
		this.filas = filas;
	}
	public void setColumnas(int columnas)
	{
		this.columnas = columnas;
	}
	public void dimGrilla(int f, int c)
	{
		grilla = new String[f][c];
	}
	public String[][] getGrilla()
	{
		return grilla;
	}
	public int getPosicion(String unValor)
	{
		for(int i=0;i<filas;i++)
		{
			for(int j=0;j<columnas;j++)
			{
				//System.out.print(tablero[i][j]);
				if(grilla[i][j].equals(unValor))
				{
					return (i*10) + j;
				}
			}
		}
		return -1;
	}
	
	public void setCasilla(String valor, int f,int c)
	{
		grilla[f][c]= valor;
	}
	
	public int getFilas(){
		return this.filas;
	}
	
	public int getColumnas(){
		return this.columnas;
	}
	
	public void print()
	{
		for(int i=0;i<filas;i++)
		{
			for(int j=0;j<columnas;j++)
			{
				System.out.print(grilla[i][j]);
			}
			System.out.println("");
		}
	}

}
