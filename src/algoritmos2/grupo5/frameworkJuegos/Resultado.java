package algoritmos2.grupo5.frameworkJuegos;

public class Resultado {
	private Jugador ganador;
	
	public Jugador getGanador(){
		return this.ganador;		
	}
	
	public void setGanador(Jugador ganador){
		this.ganador = ganador;
	}
	
	public boolean hayEmpate(){
		return this.ganador == null;				
	}
	
	public Resultado(Jugador jugador)
	{
		this.ganador = jugador;
	}
	
	public Resultado()
	{
		
	}
	
	@Override
	public String toString(){
		if(this.hayEmpate())
			return "Empate";
		else
			return "El ganador es: " + this.ganador.getFicha();
	}
}
