package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Tablero;


public class TableroTateti extends Tablero
{
	private int cantidaCasillas;
	private int contadorCasillasOcupadas;
	
	
	public TableroTateti()
	{
		super.setFilas(3);
		super.setColumnas(3);
		super.dimGrilla(3,3);
	}
	
	@Override
	public void inicializar()
	{
		for (int i = 0; i < this.getFilas(); i++){
			for (int j = 0; j < this.getColumnas(); j++){
				this.grilla[i][j] = "";
			}
		}		
	}

	
	
	
	
	//-----getters y setters----------------------------------------
	public int getCantidaCasillas()
	{
		return cantidaCasillas;
	}
	public int getContadorCasillasOcupadas()
	{
		return contadorCasillasOcupadas;
	}	
}
