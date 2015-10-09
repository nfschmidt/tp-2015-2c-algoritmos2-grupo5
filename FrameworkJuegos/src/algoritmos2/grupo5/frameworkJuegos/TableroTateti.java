package algoritmos2.grupo5.frameworkJuegos;

public class TableroTateti extends Tablero
{
	public TableroTateti(int f, int c)
	{
		super.setFilas(f);
		super.setColumnas(c);
		super.dimTablero(f,c);
	}
	public void formatear()
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
}
