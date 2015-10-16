package frameworkJuegos.tamagotchi;

public abstract class Vivo extends Estado
{	
	public abstract void comer(Tamagotchi unTamagotchi);
	public abstract void jugar(Tamagotchi unTamagotchi);
	public abstract void curar(Tamagotchi unTamagotchi);
	public abstract void dormir(Tamagotchi unTamagotchi);
	@Override
	public boolean estasVivo()
	{
		return true;
	}
	

	
	
	//getters y setters----------------------------------------
	public int getCantidadPuntosExtraSalud(Nivel unNivel)
	{
		return (unNivel.getSaludMaxima()/3);
	}
	public int getCantidadPuntosExtraEnergia(Nivel unNivel)
	{
		return (unNivel.getEnergiaMaxima()/3);
	}
	public int getCantidadPuntosExtraFelicidad(Nivel unNivel)
	{
		return (unNivel.getFelicidadMaxima()/3);
	}
	public int getCantidadPuntosExtraHambre(Nivel unNivel)
	{
		return (unNivel.getHambreMaxima()/3);
	}
	
}
