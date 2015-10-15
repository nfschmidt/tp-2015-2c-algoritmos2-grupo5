package frameworkJuegos.tamagotchi;

public abstract class Nivel implements INivel
{
	protected UITamagotchi ui;
	Tamagotchi unTamagotchi;
	private int saludMaxima;
	private int energiaMaxima;
	private int felicidadMaxima;
	private int hambreMaxima;
	
	//public int getNivelMinimoHambre();
	public abstract void dormir(Tamagotchi unTamagotchi);
	public abstract void comer(Tamagotchi unTamagotchi);
	public abstract void jugar(Tamagotchi unTamagotchi);
	public abstract void curar(Tamagotchi unTamagotchi);
    public abstract String[] getMenu();
    public abstract void crecer(Tamagotchi unTamagotchi);
	public void gestionarMenu(int opcionElegida, Tamagotchi unTamagotchi)
	{
		
	}
	public int getNivelMinimoHambre()
	{
		// TODO Auto-generated method stub
		return 0;
	}
	public void InicializarMenu(String[] crearMenu)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	//getters y setters----------------------------------------
	public int getSaludMaxima()
	{
		return saludMaxima;
	}
	public void setSaludMaxima(int saludMaxima)
	{
		this.saludMaxima = saludMaxima;
	}
	public int getEnergiaMaxima()
	{
		return energiaMaxima;
	}
	public void setEnergiaMaxima(int energiaMaxima)
	{
		this.energiaMaxima = energiaMaxima;
	}
	public int getFelicidadMaxima()
	{
		return felicidadMaxima;
	}
	public void setFelicidadMaxima(int felicidadMaxima)
	{
		this.felicidadMaxima = felicidadMaxima;
	}
	public int getHambreMaxima()
	{
		return hambreMaxima;
	}
	public void setHambreMaxima(int hambreMaxima)
	{
		this.hambreMaxima = hambreMaxima;
	}
	public Tamagotchi getTamagotchi()
	{ 
		return unTamagotchi;
	}
}
