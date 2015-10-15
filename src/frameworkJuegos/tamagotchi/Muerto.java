package frameworkJuegos.tamagotchi;

public class Muerto extends Estado
{
	public void afectarA(Tamagotchi unTamagotchi)
	{
		unTamagotchi.morir();
	}
	public boolean puedeAfectarA(Tamagotchi unTamagotchi)
	{
		return(unTamagotchi.getSalud()< 1)
				|| 
			  (unTamagotchi.getHambre() > unTamagotchi.getNivelMinimoHambre()) ;
	}
	@Override
	public boolean estasVivo()
	{
		return false;
	}
	
}
