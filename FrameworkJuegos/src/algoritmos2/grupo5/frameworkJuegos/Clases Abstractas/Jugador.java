package algoritmos2.grupo5.frameworkJuegos;

public class Jugador
{
	private String nombre;
	public Jugador(String nombre)
	{
		this.nombre =nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre =nombre;
	}
	
	//El juego le ordenara al jugador que juegue y este devolvera una jugada.
	public abstract Jugada jugar();
}
