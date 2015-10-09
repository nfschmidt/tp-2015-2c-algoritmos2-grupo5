package algoritmos2.grupo5.frameworkJuegos;

public class JugadaTateti extends Jugada
{
	private static int unaPosicion;
	public JugadaTateti(Tablero tablero, Reglamento reglamento)
	{
		this.tablero = tablero;
		this.reglamento = reglamento;
	}
	 public boolean validar(int unValor)
	 { 
		 unaPosicion = tablero.getPosicion(Integer.toString(unValor));
		 return reglamento.esValida(unaPosicion);//si encontró unValor en el tablero
	 }
	 public void jugar(int casillasOcupadas)
	 {
		 String unCaracter = getCaracter(casillasOcupadas);
		 tablero.setCasilla(unCaracter,unaPosicion/10,unaPosicion % 10);
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

