package frameworkJuegos.tamagotchi;

public class Normal extends Vivo
{
	public Normal(Nivel unNivel)
	{
	
	}

	public void afectarA(Tamagotchi unTamagotchi)
	{

	}
	
	public boolean puedeAfectarA(Tamagotchi unTamagotchi)
	{
		return true;
	}
	public void dormir(Tamagotchi unTamagotchi)
	{
		unTamagotchi.aumentarEnergia(getCantidadPuntosExtraEnergia(unTamagotchi.getNivel()));
	}
	@Override
	public void comer(Tamagotchi unTamagotchi)
	{
		unTamagotchi.disminuirHambre(getCantidadPuntosExtraHambre(unTamagotchi.getNivel()));
	}
	@Override
	public void jugar(Tamagotchi unTamagotchi)
	{
		unTamagotchi.aumentarFelicidad(getCantidadPuntosExtraFelicidad(unTamagotchi.getNivel()));
	}
	@Override
	public void curar(Tamagotchi unTamagotchi)
	{
		unTamagotchi.aumentarSalud(getCantidadPuntosExtraSalud(unTamagotchi.getNivel()));
	}
}
