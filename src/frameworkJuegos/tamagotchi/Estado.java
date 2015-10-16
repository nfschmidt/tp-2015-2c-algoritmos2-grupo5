package frameworkJuegos.tamagotchi;

public abstract class Estado
{ 
	private Tamagotchi miTamagotchi;
	public abstract void afectarA(Tamagotchi unTamagotchi);
	public abstract boolean puedeAfectarA(Tamagotchi unTamagotchi);

	public abstract boolean estasVivo();
	
	
	
	
	//--getters y setters--------------------------------------
	public Tamagotchi getMiTamagotchi()
	{
		return miTamagotchi;
	}
	public void setMiTamagotchi(Tamagotchi miTamagotchi)
	{
		this.miTamagotchi = miTamagotchi;
	}
	public String nombre()
	{
		// TODO Auto-generated method stub
		return "Normal";
	}

}
