package frameworkJuegos.tateti;

import java.util.List;

import algoritmos2.grupo5.frameworkJuegos.Jugada;
import algoritmos2.grupo5.frameworkJuegos.Jugador;
import algoritmos2.grupo5.frameworkJuegos.Reglamento;
import algoritmos2.grupo5.frameworkJuegos.Tablero;

public class ReglamentoTateti extends Reglamento
{
	private List<Jugador> jugadores;	
	public List<Jugador> getJugadores(){
		return this.jugadores;
	}
	public void setJugadores(List<Jugador> jugadores){
		this.jugadores = jugadores;
	}
	
	public boolean esValida(int unaPosicion)
	{
		if (unaPosicion != -1)
			return true;
		else
			return false;
	}
	
	/*public boolean esFin(IJugada unaJugada)
	{
		JugadaTateti jugada=(JugadaTateti)unaJugada;
		return (esGanador(jugada)|| hayEmpate(jugada));
	}
	public boolean esGanador(IJugada jugada)
	{
		return false;//agregar los casos en que alguien gana
	}
	public boolean hayEmpate(IJugada unaJugada)
	{
		JugadaTateti jugada=(JugadaTateti)unaJugada;
		int cantidadCasillas = jugada.getTablero().getCantidaCasillas();
		int contadorCasillas = jugada.getTablero().getContadorCasillasOcupadas();
		return (cantidadCasillas == contadorCasillas);
	}*/

	@Override
	public boolean esFin(Tablero tablero)
	{
		boolean esFin = false;
		for (int i = 0; i < tablero.getFilas(); i++){
			for (int j = 0; j < tablero.getColumnas(); j++){
				if ( tablero.grilla[i][j] == "X" || tablero.grilla[i][j] == "O"){
					esFin = true;
				}
				else{
					return false;
				}
			}
		}
		return esFin;
	}

	@Override
	public boolean esGanador()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean jugadaValida(Jugada jugada, Tablero tablero)
	{
		boolean esValida;
		esValida = jugada.getPosicionX() <= tablero.getFilas() && jugada.getPosicionY() <= tablero.getColumnas();
		esValida = esValida && tablero.grilla[jugada.getPosicionX()][jugada.getPosicionY()].length() == 0;
		
		return esValida;
	}

	@Override
	public boolean esFinDeTurno(Tablero tablero)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Jugador obtenerJugadorInicial()
	{
		for ( Jugador jugador : this.getJugadores() ) {
            if (jugador.getFicha() == "X")
            	return jugador;
		}
		return null;
	}

	@Override
	public Jugador proximoJugador(Jugador jugadorAnterior)
	{
		int indiceJugador = this.getJugadores().indexOf(jugadorAnterior);
		if (indiceJugador > 0){
			if (indiceJugador == this.getJugadores().size() - 1){
				return this.getJugadores().get(0);
			}
			else
				return this.getJugadores().get(indiceJugador + 1);
		}
		return null;
	}


}
