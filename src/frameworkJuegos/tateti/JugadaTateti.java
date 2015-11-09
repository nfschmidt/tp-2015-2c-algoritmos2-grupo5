package frameworkJuegos.tateti;

import java.util.ArrayList;
import algoritmos2.grupo5.frameworkJuegos.IGameObject;
import algoritmos2.grupo5.frameworkJuegos.Jugada;
import algoritmos2.grupo5.frameworkJuegos.Tablero;

public class JugadaTateti extends Jugada
{	
	private UITateti ui;
	private static int unaPosicion;
	private TableroTateti tablero;

	
	
	public JugadaTateti(ArrayList<IGameObject> unaListaGameObjects)
	{
		this.tablero = (TableroTateti)unaListaGameObjects.get(0);
	}
	/*public void inicializar()
	{
		ui= new UITateti();
		ui.comenzar();
		setReglamento(new ReglamentoTateti());
	}
	 public boolean validar(int unValor)
	 { 
		 unaPosicion = tablero.getPosicion(Integer.toString(unValor));
	     return getReglamento().esValida(unaPosicion);//si encontró unValor en el tablero
	 }
	 
	 public void jugar()
	 {
		String unCaracter;
		ui.imprimirMenu(); 
	    int unValor =ui.scanearValor();
		if (validar(unValor))
		{
			unCaracter = getCaracter(tablero.getContadorCasillasOcupadas());
			tablero.setCasilla(unCaracter,unaPosicion/10,unaPosicion % 10);
			tablero.aumentarContadorCasillasOcupadas();
			ui.actualizar(tablero);
		}
		else
		{
			ui.imprimir("Ese numero no, elegi otro");
		}
	 }*/
	
	 public String getCaracter(int casillasOcupadas)
	 {
			if (casillasOcupadas%2==0)
				return "O";
	    	else
	    		return "X";	
	 }

	 public TableroTateti getTablero()
	 {
		 return tablero;
	 }
	@Override
	public void ejecutar(Tablero tablero)
	{
		tablero.setCasilla(this.getJugador().getFicha(),this.posicionX,this.posicionY);
	}

	@Override
	public void inicializar()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar()
	{
		// TODO Auto-generated method stub
		
	}

 }

