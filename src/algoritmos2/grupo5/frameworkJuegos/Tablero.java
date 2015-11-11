package algoritmos2.grupo5.frameworkJuegos;

public abstract class Tablero
{
	protected int filas;
	protected int columnas;
	protected String[][] grilla;
	
	public Tablero(int f, int c)
	{
		filas = f;
		columnas = c;
		grilla = new String[filas][columnas];
		
		inicializar();
	}
	
	public int getFilas(){
		return this.filas;
	}
	
	public int getColumnas(){
		return this.columnas;
	}
	
	public void setCasilla(int fila, int columna, String valor) {
		this.grilla[fila][columna] = valor;
	}
	
	public String getCasilla(int fila, int columna) {
		return this.grilla[fila][columna];
	}
	
	public abstract void inicializar();

}
