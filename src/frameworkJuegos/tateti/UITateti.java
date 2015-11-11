package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Tablero;
import algoritmos2.grupo5.frameworkJuegos.UI;

public class UITateti extends UI {
	
	@Override
	public void finalizarJuego()
	{
		System.out.println("Resultado: " + resultado.toString());
	}

	@Override
	public void actualizarVista(Tablero tablero) {
		for(int fila = 0; fila < tablero.getFilas(); fila ++){
			for(int columna = 0; columna < tablero.getColumnas(); columna ++) {
				System.out.print(tablero.getCasilla(fila, columna));
				
				if (columna < tablero.getColumnas() - 1) {
					System.out.print("|");
				}
			}
			if (fila < tablero.getColumnas() - 1) {
				System.out.println("\n-----");
			}
		}
		
		System.out.println("");
	}
}
