package algoritmos2.grupo5.frameworkJuegos;

public class JugadaTateti extends Jugada
{	
	private UITateti ui;
	private static int unaPosicion;
	public JugadaTateti(Tablero tablero, Reglamento reglamento)
	{
		this.setTablero(tablero);
		this.setReglamento(reglamento);
	}
	public void inicializar()
	{
		ui= new UITateti();
		ui.comenzar();
	}
	 public boolean validar(int unValor)
	 { 
		 unaPosicion = getTablero().getPosicion(Integer.toString(unValor));
		 return getReglamento().esValida(unaPosicion);//si encontró unValor en el tablero
	 }
	 
	 public int jugar( int contadorCasillasOcupadas)
	 {
	    String unCaracter;
		ui.imprimirMenu(); 
	    int unValor =ui.scanearValor();
		if (validar(unValor))
		{
			unCaracter = getCaracter(contadorCasillasOcupadas);
			getTablero().setCasilla(unCaracter,unaPosicion/10,unaPosicion % 10);
			ui.actualizar(super.getTablero());
			contadorCasillasOcupadas++;
		}
		else
		{
			ui.imprimir("Ese numero no, elegi otro");
		}
		return contadorCasillasOcupadas;
	 }
	 public String getCaracter(int casillasOcupadas)
	 {
			if (casillasOcupadas%2==0)
				return "O";
	    	else
	    		return "X";	
	 }
	 public Boolean chequearFin(int cantidadCasillas,int cantidadCasillasOcupadas)
	 {
		 return  (cantidadCasillas==cantidadCasillasOcupadas);
	 }
 }

