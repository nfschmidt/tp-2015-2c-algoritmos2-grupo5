package algoritmos2.grupo5.frameworkJuegos;

public abstract class Jugador
{
	public String ficha;
	private String nombre;
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre =nombre;
	}
	
	public String getFicha()
	{
		return ficha;
	}
	
	public void setFIcha(String ficha)
	{
		this.ficha = ficha;
	}
}
