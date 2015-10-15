package frameworkJuegos.tateti;

import algoritmos2.grupo5.frameworkJuegos.Tablero;


public class TableroTateti extends Tablero
{
	private int cantidaCasillas;
	private int contadorCasillasOcupadas;
	
	public TableroTateti(int f, int c)
	{
		setContadorCasillasOcupadas(0);
		setCantidaCasillas(9);
		super.setFilas(f);
		super.setColumnas(c);
		super.dimTablero(f,c);
	}
	public void inicializar()
	{
		int contador=1;
		String unValor;
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (i%2==0) 
					{
						if (j%2==0) 
							{
								unValor=Integer.toString(contador);
								setCasilla(unValor,i,j);
								contador++;
							}
						else setCasilla("|",i,j);
					}
				else setCasilla("-",i,j);
			}
		}
	}
	@Override
	public void actualizar()
	{
		// TODO Auto-generated method stub
	}
	
	public void aumentarContadorCasillasOcupadas()
	{
		contadorCasillasOcupadas++;
	}
	
	
	
	
	//-----getters y setters----------------------------------------
	public int getCantidaCasillas()
	{
		return cantidaCasillas;
	}
	private void setCantidaCasillas(int cantidaCasillas)
	{
		this.cantidaCasillas = cantidaCasillas;
	}
	public int getContadorCasillasOcupadas()
	{
		return contadorCasillasOcupadas;
	}
	private void setContadorCasillasOcupadas(int contadorCasillasOcupadas)
	{
		this.contadorCasillasOcupadas = contadorCasillasOcupadas;
	}

}
