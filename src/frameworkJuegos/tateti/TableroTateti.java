package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Tablero;


public class TableroTateti extends Tablero
{
	public TableroTateti() {
		super(3, 3);
	}

	@Override
	public void inicializar() {
		for (int fila = 0; fila < this.filas; fila ++) {
			for (int columna = 0; columna < this.columnas; columna ++) {
				this.grilla[fila][columna] = " ";
			}
		}
	}
	
}
