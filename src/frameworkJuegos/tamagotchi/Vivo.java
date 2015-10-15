package frameworkJuegos.tamagotchi;

public abstract class Vivo extends Estado
{

	private int cantidadPuntosExtraSalud;
	private int cantidadPuntosExtraEnergia;
	private int cantidadPuntosExtraFelicidad;
	private int cantidadPuntosExtraHambre;
	
	public abstract void comer(Tamagotchi unTamagotchi);
	public abstract void jugar(Tamagotchi unTamagotchi);
	public abstract void curar(Tamagotchi unTamagotchi);
	public abstract void dormir(Tamagotchi unTamagotchi);
	@Override
	public boolean estasVivo()
	{
		return true;
	}
	public void inicializar(Nivel unNivel)
	{
		setCantidadPuntosExtraEnergia(unNivel.getEnergiaMaxima()/2);
		setCantidadPuntosExtraFelicidad(unNivel.getFelicidadMaxima()/2);
		setCantidadPuntosExtraHambre(unNivel.getHambreMaxima()/4);
		setCantidadPuntosExtraSalud(unNivel.getSaludMaxima()/2);
	}
	

	
	
	//getters y setters----------------------------------------
	public int getCantidadPuntosExtraSalud()
	{
		return cantidadPuntosExtraSalud;
	}
	public void setCantidadPuntosExtraSalud(int cantidadPuntosExtraSalud)
	{
		this.cantidadPuntosExtraSalud = cantidadPuntosExtraSalud;
	}
	public int getCantidadPuntosExtraEnergia()
	{
		return cantidadPuntosExtraEnergia;
	}
	public void setCantidadPuntosExtraEnergia(int cantidadPuntosExtraEnergia)
	{
		this.cantidadPuntosExtraEnergia = cantidadPuntosExtraEnergia;
	}
	public int getCantidadPuntosExtraFelicidad()
	{
		return cantidadPuntosExtraFelicidad;
	}
	public void setCantidadPuntosExtraFelicidad(int cantidadPuntosExtraFelicidad)
	{
		this.cantidadPuntosExtraFelicidad = cantidadPuntosExtraFelicidad;
	}
	public int getCantidadPuntosExtraHambre()
	{
		return cantidadPuntosExtraHambre;
	}
	public void setCantidadPuntosExtraHambre(int cantidadPuntosExtrahambre)
	{
		this.cantidadPuntosExtraHambre = cantidadPuntosExtrahambre;
	}
	
}
